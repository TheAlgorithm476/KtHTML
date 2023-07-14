package me.thealgorithm476.kthtml

/**
 * # Tag
 * Main 'Tag' class. Every HTML Tag will be extending this class. It holds basic information, as well as a few utility methods to print out the HTML tree.
 *
 * Implementation for printing the tree itself should be supplied by the classes extending this method, however.
 *
 * @property name The name of this element, for example `p`, `span`, `html`, ...
 * @property id The id of this element
 * @property classes An Array of classes that this element has
 * @property attributes An Array of key-value pairs that represent the attributes of this class
 * @since 1.0.0
 */
abstract class Tag(val name: String, val id: String? = null, val classes: Array<String> = emptyArray(), val attributes: Array<Pair<String, String?>> = emptyArray()) {
    /**
     * Prints the id of this tag according to following formatting: `id="<id>"`, with `<id>` being the id of this tag, if applicable.
     *
     * When the id is null, an empty string will be returned.
     *
     * @return The String representation of the id of the tag
     * @since 1.0.0
     */
    protected fun printId(): String = if (id == null) "" else "id=\"$id\""

    /**
     * Prints the classes of this tag according to following formatting: `class="<class0> <class1> <class2> ... <classN>"`, with each class entry being the classes of this tag.
     *
     * If this tag has no classes set, an empty string will be returned.
     *
     * @return The String representation of the classes of the tag
     * @since 1.0.0
     */
    protected fun printClasses(): String {
        if (classes.isEmpty()) return ""
        return "class=\"${classes.joinToString(" ")}\""
    }

    /**
     * Prints the attributes of this tag according to following formatting: `<key0>=<value0> <key1>=<value1> <key2>=<value2> ... <keyN>=<valueN>`, with each key-value pair being an attribute of this tag.
     *
     * If this tag has no attributes set, an empty string will be returned
     *
     * @return The String representation of attributes of the tag
     * @since 1.0.0
     */
    protected fun printAttributes(): String = attributes.filter { (_, value) -> value != null }.joinToString(" ") { (key, value) -> "$key=\"$value\"" }

    /**
     * Constructs an HTML tree, along with line breaks and correct indentation, and puts the result in the supplied StringBuilder instance.
     *
     * @param builder The StringBuilder used for building this Tree. The result will be directly added to this builder
     * @param indent The indentation this toString call uses. Used internally to manage the right indentation.
     * @since 1.0.0
     */
    abstract fun toString(builder: StringBuilder, indent: String = "")

    /**
     * Constructs an HTML tree, all on one single line, without any spaces between elements. A minified representation of the tree.
     *
     * @param builder The StringBuilder used for building this tree. The result will be directly added to this builder
     * @since 1.0.0
     */
    abstract fun minified(builder: StringBuilder)
}

/**
 * # Plain Tag
 * Tag class used for representing text within the tree. This element is not a tag on its own, and will not show any classes, ids, or other attributes linked to normal tags.
 *
 * This 'tag' is mainly used for adding text directly to the tree, without wrapping it into a paragraph or span.
 *
 * @property content The text that should be inlined into the HTML tree.
 * @since 1.0.0
 */
class PlainTag(private val content: String) : Tag(name = "_plain") {
    override fun toString(builder: StringBuilder, indent: String) { builder.append("$indent$content\n") }

    override fun minified(builder: StringBuilder) { builder.append(content) }
}

/**
 * # Void Tag
 * Tag class used for elements that don't have a closing tag, and are self-enclosed.
 *
 * @property slash Whether or not the ending of the tag should be a slash or not
 * @since 1.0.0
 */
class VoidTag(name: String, private val slash: Boolean = false, id: String? = null, classes: Array<String> = emptyArray(), attributes: Array<Pair<String, String?>> = emptyArray()) : Tag(name = name, id = id, classes = classes, attributes = attributes) {
    private fun generateContent(): String = arrayOf(name, printId(), printClasses(), printAttributes(), (if (slash) "/" else "")).filter { it.isNotEmpty() }.joinToString(separator = " ")

    override fun toString(builder: StringBuilder, indent: String) { builder.append("$indent<${generateContent()}>\n") }

    override fun minified(builder: StringBuilder) { builder.append("<${generateContent()}>") }
}

class ContentTag(name: String, private val content: String, id: String? = null, classes: Array<String> = emptyArray(), attributes: Array<Pair<String, String?>> = emptyArray()) : Tag(name = name, id = id, classes = classes, attributes = attributes) {
    private fun generateContent(): String = arrayOf(name, printId(), printClasses(), printAttributes()).filter { it.isNotEmpty() }.joinToString(separator = " ")

    override fun toString(builder: StringBuilder, indent: String) { builder.append("$indent<${generateContent()}>$content</$name>\n") }

    override fun minified(builder: StringBuilder) { builder.append("<${generateContent()}>$content</$name>") }
}

/**
 * # Container Tag
 *
 * Tag class used for elements that hold other elements.
 *
 * @property children The children of this element
 * @since 1.0.0
 */
open class ContainerTag(name: String, id: String? = null, classes: Array<String> = emptyArray(), attributes: Array<Pair<String, String?>> = emptyArray()) : Tag(name = name, id = id, classes = classes, attributes = attributes) {
    protected val children: MutableList<Tag> = ArrayList()

    /**
     * Appends a child to this tag, and returns its status
     *
     * @param child The tag to add
     * @return Whether or not adding the element was a success
     * @since 1.0.0
     */
    fun appendChild(child: Tag): Boolean = children.add(child)

    protected fun generateContent(): String = arrayOf(name, printId(), printClasses(), printAttributes()).filter { it.isNotEmpty() }.joinToString(separator = " ")

    override fun toString(builder: StringBuilder, indent: String) {
        builder.append("$indent<${generateContent()}>\n")

        for (child in children) child.toString(builder, "    $indent")

        builder.append("$indent</$name>\n")
    }

    override fun minified(builder: StringBuilder) {
        builder.append("<${generateContent()}>")

        for (child in children) child.minified(builder)

        builder.append("</$name>")
    }
}

/**
 * # HTML Tag
 *
 * Special tag that represents the first tag in the tree, `<html>`.
 *
 * It holds the capabilities to convert the abstract tree of elements into an HTML tree as a String.
 *
 * @since 1.0.0
 */
class HtmlTag(id: String? = null, classes: Array<String> = emptyArray(), xmlns: String? = null, lang: String? = null) : ContainerTag(name = "html", id = id, classes = classes, attributes = arrayOf(Pair("xmlns", xmlns), Pair("lang", lang))) {
    /**
     * Converts the entire tree of elements into a String, and returns it.
     *
     * @param minified Whether or not this tree should be minified when converting
     * @return The HTML Tree as a String
     * @since 1.0.0
     */
    fun toString(minified: Boolean = false): String = buildString { if (minified) minified(this) else toString(this) }

    override fun toString(): String = toString(false)
}

internal fun ContainerTag.void(name: String, slash: Boolean = false, id: String? = null, classes: Array<String> = emptyArray(), attributes: Array<Pair<String, String?>> = emptyArray()) {
    val tag: VoidTag = VoidTag(name = name, slash = slash, id = id, classes = classes, attributes = attributes)
    this.appendChild(tag)
}

internal fun ContainerTag.content(name: String, content: String = "", id: String? = null, classes: Array<String> = emptyArray(), attributes: Array<Pair<String, String?>> = emptyArray()) {
    val tag: ContentTag = ContentTag(name = name, content = content, id = id, classes = classes, attributes = attributes)
    this.appendChild(tag)
}

internal fun ContainerTag.container(name: String, id: String? = null, classes: Array<String> = emptyArray(), attributes: Array<Pair<String, String?>> = emptyArray(), children: ContainerTag.() -> Unit) {
    val tag: ContainerTag = ContainerTag(name = name, id = id, classes = classes, attributes = attributes)
    this.appendChild(tag)
    tag.children()
}

/**
 * Inserts a Plain Element into the tree. This element contains no extra data, and is just some text that will be inlined into the tree
 *
 * @param content The text to be inlined
 * @since 1.0.0
 */
fun ContainerTag._plain(content: String) {
    val tag: PlainTag = PlainTag(content = content)
    this.appendChild(tag)
}