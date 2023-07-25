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
 * Image Embed element. Embeds an image into the document.
 *
 * @param alt Alternative text description of the image
 * @param src The image URL
 * @since 1.0.2
 */
fun ContainerTag.img(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    alt: String? = null,
    src: String? = null
) = void(name = "img", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("alt", alt), Pair("src", src)))

/**
 * Keyboard Input element. Represents a span of inline text denoting user input from a keyboard.
 *
 * Usually represented as monospace text
 *
 * @since 1.0.2
 */
fun ContainerTag.kbd(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "kbd", content = content, id = id, classes = classes)

/**
 * Label element. Represents a caption for an item.
 *
 * @param for Must be a single id for a labelable for element.
 * @since 1.0.2
 */
fun ContainerTag.label(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    `for`: String? = null
) = content(name = "label", content = content, id = id, classes = classes, attributes = arrayOf(Pair("for", `for`)))

/**
 * Field Set Legend element. Represents a caption for the content of its parent `<fieldset>`.
 *
 * @since 1.0.2
 */
fun ContainerTag.legend(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "legend", content = content, id = id, classes = classes)

/**
 * List Item element. Represents an item in a list or menu.
 *
 * @param value Integer value for the order of this item in an ordered list. Not applicable to unordered lists or menus.
 * @since 1.0.2
 */
fun ContainerTag.li(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    value: String? = null
) = content(name = "li", content = content, id = id, classes = classes, attributes = arrayOf(Pair("value", value)))

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
 * Mark Text element. Represents text that is marked or highlighted for reference or notation purposes.
 *
 * Usually represented by highlighted text.
 *
 * @since 1.0.2
 */
fun ContainerTag.mark(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "mark", content = content, id = id, classes = classes)

/**
 * Menu element. Semantic alternative to `<ul>`.
 *
 * @since 1.0.2
 */
fun ContainerTag.menu(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "menu", id = id, classes = classes, children = children)

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
 * Noscript element. Defines a section of HTML to be inserted if scripting is disabled by the browser.
 *
 * @since 1.0.2
 */
fun ContainerTag.noscript(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "noscript", id = id, classes = classes, children = children)

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
 * Picture element. Contains zero or more `<source>` elements and one `<img>` element to offer alternative versions of an image.
 *
 * @since 1.0.2
 */
fun ContainerTag.picture(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "picture", id = id, classes = classes, children = children)

/**
 * Preformatted Text element. Represents preformatted text to be presented exact as written in the HTML.
 *
 * Usually represented by a monospace font.
 *
 * @since 1.0.2
 */
fun ContainerTag.pre(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "pre", content = content, id = id, classes = classes)

/**
 * Progress Indicator element. Displays an indicator showing the completion progress of a task.
 *
 * @param max How much work the task represents. Must be a valid number
 * @param value How much of the task has been completed. Must be a valid number
 * @since 1.0.2
 */
fun ContainerTag.progress(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    max: String? = null,
    value: String? = null
) = content(name = "progress", content = content, id = id, classes = classes)

/**
 * Ruby Fallback Parenthesis element. Used to provide fall-back parentheses for browsers that do not support display of ruby annotations.
 *
 * @since 1.0.2
 */
fun ContainerTag.rp(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "rp", content = content, id = id, classes = classes)

/**
 * Ruby Text element. Specifies the ruby text component of a ruby annotation
 *
 * @since 1.0.2
 */
fun ContainerTag.rt(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "rt", content = content, id = id, classes = classes)

/**
 * Ruby Annotation element. Represents small annotations that are rendered above, below or next to a base text, used for showing the pronunciation of East Asian characters.
 *
 * @since 1.0.2
 */
fun ContainerTag.ruby(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "ruby", id = id, classes = classes, children = children)

/**
 * Strikethrough element. Represent things that are no longer relevant or accurate.
 *
 * @since 1.0.2
 */
fun ContainerTag.s(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "s", content = content, id = id, classes = classes)

/**
 * Sample Output element. Used to enclose inline text representing sample output from a computer program.
 *
 * Usually rendered with a monospace font.
 *
 * @since 1.0.2
 */
fun ContainerTag.samp(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "samp", content = content, id = id, classes = classes)

/**
 * Script element. Used to embed executable code or data.
 *
 * Typically used with JavaScript, but also usable for GLSL (WebGL) or JSON, among others.
 *
 * @since 1.0.2
 */
fun ContainerTag.script(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    src: String? = null
) = content(name = "script", content = content, id = id, classes = classes, attributes = arrayOf(Pair("src", src)))

/**
 * Generic Section element. Represents a generic standalone section of a document.
 *
 * @since 1.0.2
 */
fun ContainerTag.section(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "section", id = id, classes = classes, children = children)

/**
 * Side Comment element. Represents side comments and small print, like copyright and legal text.
 *
 * Usually rendered one font size smaller than the default.
 *
 * @since 1.0.2
 */
fun ContainerTag.small(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "small", content = content, id = id, classes = classes)

/**
 * Content Span element. Represents a generic inline container for phrasing content
 *
 * @since 1.0.2
 */
fun ContainerTag.span(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "span", content = content, id = id, classes = classes)

/**
 * Strong Importance element. Represents strong importance, seriousness, or urgency.
 *
 * Usually rendered as bold text.
 *
 * @since 1.0.2
 */
fun ContainerTag.strong(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "strong", content = content, id = id, classes = classes)

/**
 * Style Information element. Contains style information for a document or part of document.
 *
 * @since 1.0.2
 */
fun ContainerTag.style(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "style", content = content, id = id, classes = classes)

/**
 * Subscript element. Specifies inline text which should be displayed as subscript.
 *
 * @since 1.0.2
 */
fun ContainerTag.sub(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "sub", content = content, id = id, classes = classes)

/**
 * Disclosure Summary element. Specifies a summary, caption, or legend for a `<details>` element.
 *
 * @since 1.0.2
 */
fun ContainerTag.summary(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "summary", content = content, id = id, classes = classes)

/**
 * Superscript element. Specifies inline text which should be displayed as superscript.
 *
 * @since 1.0.2
 */
fun ContainerTag.sup(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "sup", content = content, id = id, classes = classes)

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