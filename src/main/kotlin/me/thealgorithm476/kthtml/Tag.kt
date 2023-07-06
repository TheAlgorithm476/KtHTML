package me.thealgorithm476.kthtml

abstract class Tag(val name: String, val id: String? = null, val classes: Array<String> = emptyArray(), val attributes: Array<Pair<String, String?>> = emptyArray()) {
    protected fun printId(): String = if (id == null) "" else "id=\"$id\""

    protected fun printClasses(): String {
        if (classes.isEmpty()) return ""
        return "class=\"${classes.joinToString(" ")}\""
    }

    protected fun printAttributes(): String = attributes.filter { (_, value) -> value != null }.joinToString(" ") { (key, value) -> "$key=\"$value\"" }

    abstract fun toString(builder: StringBuilder, indent: String = "")

    abstract fun minified(builder: StringBuilder)
}

class PlainTag(private val content: String) : Tag(name = "_plain") {
    override fun toString(builder: StringBuilder, indent: String) { builder.append("$indent$content\n") }

    override fun minified(builder: StringBuilder) { builder.append(content) }
}

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

open class ContainerTag(name: String, id: String? = null, classes: Array<String> = emptyArray(), attributes: Array<Pair<String, String?>> = emptyArray()) : Tag(name = name, id = id, classes = classes, attributes = attributes) {
    protected val children: MutableList<Tag> = ArrayList()

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

class HtmlTag(id: String? = null, classes: Array<String> = emptyArray(), xmlns: String? = null, lang: String? = null) : ContainerTag(name = "html", id = id, classes = classes, attributes = arrayOf(Pair("xmlns", xmlns), Pair("lang", lang))) {
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

fun ContainerTag._plain(content: String) {
    val tag: PlainTag = PlainTag(content = content)
    this.appendChild(tag)
}