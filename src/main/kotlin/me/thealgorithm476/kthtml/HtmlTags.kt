package me.thealgorithm476.kthtml

/**
 * Function that generates the initial HTML Tag that starts the tree.
 *
 * @param xmlns Specifies the XML namespace of the document. Not required by the HTML Spec, but recommended if you plan on parsing this tree with an XML parser.
 * @param lang Specifies the language of the document. Recommended to use, for accessibility purposes.
 * @return The HTML Tag associated with the given parameters
 * @since 1.0.0
 */
fun html(id: String? = null, classes: Array<String> = emptyArray(), xmlns: String? = null, lang: String? = null, children: ContainerTag.() -> Unit): HtmlTag {
    val tag: HtmlTag = HtmlTag(id = id, classes = classes, xmlns = xmlns, lang = lang)
    tag.children()

    return tag
}

/**
 * Anchor element. Creates a hyperlink to anything that can be represented by a URL.
 *
 * @param href Specifies where this element should link to when clicked.
 * @param target Specifies where the linked URL should be displayed. Could be `_self`, `_blank`, `_parent`, or `_top`.
 * @param type Specifies what MIME type the linked URL has.
 * @since 1.0.0
 */
fun ContainerTag.a(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    href: String? = null,
    target: String? = null,
    type: String? = null
) = content(name = "a", content = content, id = id, classes = classes, attributes = arrayOf(Pair("href", href), Pair("target", target), Pair("type", type)))

/**
 * Abbreviation element. Represents an abbreviation or acronym.
 *
 * @param title Full description of the abbreviation
 * @since 1.0.0
 */
fun ContainerTag.abbr(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    title: String? = null
) = content(name = "abbr", content = content, id = id, classes = classes, attributes = arrayOf(Pair("title", title)))

/**
 * Bring Attention To element. Represents an element that should draw the reader's attention to its contents.
 *
 * Usually represented as bold text.
 *
 * @since 1.0.0
 */
fun ContainerTag.b(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "b", content = content, id = id, classes = classes)

/**
 * Document Body element. Represents the content of an HTML Document.
 *
 * @since 1.0.0
 */
fun ContainerTag.body(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "body", id = id, classes = classes, children = children)

/**
 * Line Break element. Represents a carriage return in text.
 *
 * @since 1.0.0
 */
fun ContainerTag.br(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray()
) = void(name = "br", slash = slash, id = id, classes = classes)

/**
 * Content Division element. Represents a generic container for content within the HTML document.
 *
 * @since 1.0.0
 */
fun ContainerTag.div(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "div", id = id, classes = classes, children = children)

/**
 * Level 1 Section Heading element.
 *
 * @since 1.0.0
 */
fun ContainerTag.h1(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h1", content = content, id = id, classes = classes)

/**
 * Level 2 Section Heading element.
 *
 * @since 1.0.0
 */
fun ContainerTag.h2(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h2", content = content, id = id, classes = classes)

/**
 * Level 3 Section Heading element.
 *
 * @since 1.0.0
 */
fun ContainerTag.h3(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h3", content = content, id = id, classes = classes)

/**
 * Level 4 Section Heading element.
 *
 * @since 1.0.0
 */
fun ContainerTag.h4(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h4", content = content, id = id, classes = classes)

/**
 * Level 5 Section Heading element.
 *
 * @since 1.0.0
 */
fun ContainerTag.h5(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h5", content = content, id = id, classes = classes)

/**
 * Level 6 Section Heading element.
 *
 * @since 1.0.0
 */
fun ContainerTag.h6(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h6", content = content, id = id, classes = classes)

/**
 * Document Metadata/Header element. Represents machine-readable information about the document.
 *
 * @since 1.0.0
 */
fun ContainerTag.head(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "head", id = id, classes = classes, children = children)

/**
 * Horizontal Rule element. Represents a thematic break between paragraph-level elements.
 *
 * @since 1.0.0
 */
fun ContainerTag.hr(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray()
) = void(name = "hr", slash = slash, id = id, classes = classes)

/**
 * Idiomatic Text element. Represents text that is set off from normal text, for any reason.
 *
 * Usually represented as italic text.
 *
 * @since 1.0.0
 */
fun ContainerTag.i(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "i", content = content, id = id, classes = classes)

/**
 * External Resource Link element. Represents relationships between the current document, and some external resource.
 *
 * @param rel Specifies the relationship of the link. Denotes how the resource is being linked.
 * @param href Specifies where this URL is linking to.
 * @since 1.0.0
 */
fun ContainerTag.link(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    rel: String? = null,
    href: String? = null
) = void(name = "link", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("rel", rel), Pair("href", href)))

/**
 * Main element. Represents the dominant content of the body of a document.
 *
 * @since 1.0.0
 */
fun ContainerTag.main(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "main", id = id, classes = classes, children = children)

/**
 * Metadata element. Represents metadata that can not be represented by other meta-related elements.
 *
 * @param charset Specifies the document's character encoding. If this attribute is set, no other meta attributes can be set on this element.
 * @param content Specifies the value for the [http_equiv] or [name] attribute, depending on which one is set. If this attribute is set, either [http_equiv] or [name] should be set as well.
 * @param http_equiv Specifies a pragma directive. If this attribute is set, [content] should be set, and [name] should NOT be set.
 * @param name Specifies document metadata in terms of key-value pairs. If this attribute is set, [content] should be set, and [http_equiv] should NOT be set.
 * @since 1.0.0
 */
fun ContainerTag.meta(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    charset: String? = null,
    content: String? = null,
    http_equiv: String? = null,
    name: String? = null
) = void(name = "meta", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("charset", charset), Pair("name", name), Pair("http-equiv", http_equiv), Pair("content", content)))

/**
 * Navigation Section element. Represents a section that provides navigation links.
 *
 * @since 1.0.0
 */
fun ContainerTag.nav(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "nav", id = id, classes = classes, children = children)

/**
 * Paragraph element.
 *
 * In KtHTML, this invocation of the paragraph element is its "content" variant, only allowing text to be inserted.
 *
 * @since 1.0.0
 */
fun ContainerTag.p(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "p", content = content, id = id, classes = classes)

/**
 * Paragraph element.
 *
 * In KtHTML, this invocation of the paragraph element is its "container" variant, allowing other elements to be inserted. Inserting text into this variant will require the use of the `_plain` function.
 *
 * @since 1.0.0
 */
fun ContainerTag.p(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "p", id = id, classes = classes, children = children)

/**
 * Scalable Vector Graphics element. Represents an SVG file within the HTML structure.
 *
 * KtHTML does not support the SVG tags, meaning that the only way to add content to this tag would be to use `_plain` functions, an adding the tags manually that way.
 *
 * @since 1.0.0
 */
fun ContainerTag.svg(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "svg", id = id, classes = classes, children = children)

/**
 * Document Title element. Represents the document's title that is shown in a browser tab.
 *
 * @since 1.0.0
 */
fun ContainerTag.title(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "title", content = content, id = id, classes = classes)

/**
 * Word Line Break Opportunity element. Represents a position within text where the browser may optionally break a line.
 *
 * @since 1.0.0
 */
fun ContainerTag.wbr(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = void(name = "wbr", slash = slash, id = id, classes = classes)