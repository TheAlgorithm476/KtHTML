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
 * Contact Address element. Represents that the enclosed elements provide contact information.
 *
 * @since 1.0.1
 */
fun ContainerTag.address(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "address", id = id, classes = classes, children = children)

/**
 * Article Contents element. Represents a self-contained composition in a document, page, application, or site.
 *
 * @since 1.0.1
 */
fun ContainerTag.article(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "article", id = id, classes = classes, children = children)

/**
 * Aside element. Represents a portion of a document whose content is only indirectly related to the main content.
 *
 * Usually represented as sidebars or call-out boxes.
 *
 * @since 1.0.1
 */
fun ContainerTag.aside(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "aside", id = id, classes = classes, children = children)

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
 * Bidirectional Isolate element. Represents text that should be treated in isolation from its surrounding text
 *
 * @since 1.0.1
 */
fun ContainerTag.bdi(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "bdi", id = id, classes = classes, children = children)

/**
 * Block Quotation element. Indicates that the enclosed elements are an extended quotation.
 *
 * @param cite A URL designating a source document for the quoted information.
 * @since 1.0.1
 */
fun ContainerTag.blockquote(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    cite: String? = null,
    children: ContainerTag.() -> Unit
) = container(name = "blockquote", id = id, classes = classes, children = children, attributes = arrayOf(Pair("cite", cite)))

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
 * Button element. Represents an interactive element activated by a user.
 *
 * @since 1.0.1
 */
fun ContainerTag.button(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "button", content = content, id = id, classes = classes)

/**
 * Table Caption element. Specifies a title of a table.
 *
 * @since 1.0.1
 */
fun ContainerTag.caption(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "caption", content = content, id = id, classes = classes)

/**
 * Citation element. Used to mark up the title of a cited work.
 *
 * @since 1.0.1
 */
fun ContainerTag.cite(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "cite", id = id, classes = classes, children = children)

/**
 * Inline Code element. Represents a short fragment of computer code.
 *
 * Rendered in the user agent's default monospace font by default.
 *
 * @since 1.0.1
 */
fun ContainerTag.code(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "code", content = content, id = id, classes = classes)

/**
 * HTML Data List element. Contains a set of `option` elements to represent options to choose from within other controls.
 *
 * @since 1.0.1
 */
fun ContainerTag.datalist(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "datalist", id = id, classes = classes, children = children)

/**
 * Description Details element. Provides the description, definition, or value for the preceding term in a description list.
 *
 * @since 1.0.1
 */
fun ContainerTag.dd(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "dd", content = content, id = id, classes = classes)

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
 * Description List element. Encloses a list of group of terms and descriptions.
 *
 * @since 1.0.1
 */
fun ContainerTag.dl(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "dl", id = id, classes = classes, children = children)

/**
 * Description Term element. Description or definition list.
 *
 * Usually followed by the `<dd>` element
 *
 * @since 1.0.1
 */
fun ContainerTag.dt(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "dt", content = content, id = id, classes = classes)

/**
 * Emphasis element. Marks text that has stress emphasis.
 *
 * @since 1.0.1
 */
fun ContainerTag.em(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "em", content = content, id = id, classes = classes)

/**
 * Figure Caption element. Describes a caption or legend description the rest of its parent figure element.
 *
 * @since 1.0.1
 */
fun ContainerTag.figcaption(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "figcaption", content = content, id = id, classes = classes)

/**
 * Figure with Optional Caption element. Represents self-contained content, with an optional caption.
 *
 * @since 1.0.1
 */
fun ContainerTag.figure(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "figure", id = id, classes = classes, children = children)

/**
 * HTML Footer element. Represents a footer for its nearest sectioning root element.
 *
 * @since 1.0.1
 */
fun ContainerTag.footer(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "footer", id = id, classes = classes, children = children)

/**
 * Form element. Represents a document section containing interactive controls for submitting information.
 *
 * @param action The URL that processes the form submission
 * @param method The HTTP method to submit the form with
 * @since 1.0.1
 */
fun ContainerTag.form(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    action: String? = null,
    method: String? = null,
    children: ContainerTag.() -> Unit
) = container(name = "form", id = id, classes = classes, children = children, attributes = arrayOf(Pair("action", action), Pair("method", method)))

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
 * HTML Header element. Represents introductory content. May contain navigation.
 *
 * @since 1.0.1
 */
fun ContainerTag.header(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "header", id = id, classes = classes, children = children)

/**
 * Represents a heading and related content.
 *
 * @since 1.0.1
 */
fun ContainerTag.hgroup(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "hgroup", id = id, classes = classes, children = children)

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