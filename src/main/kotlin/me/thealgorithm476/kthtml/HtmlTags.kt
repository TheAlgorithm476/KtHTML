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
 * @param download Causes the browser to treat the linked URL as a download
 * @param href Specifies where this element should link to when clicked.
 * @param hreflang Hints at the human language of the linked URL
 * @param ping List of URLs to which the browser will send 'PING' POST requests when clicked. Space-separated.
 * @param referrerpolicy How much of the referrer to send when clicked.
 * @param rel Specifies the relation between the target and this page.
 * @param target Specifies where the linked URL should be displayed. Could be `_self`, `_blank`, `_parent`, or `_top`.
 * @param type Specifies what MIME type the linked URL has.
 * @since 1.0.0
 */
fun ContainerTag.a(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    download: String? = null,
    href: String? = null,
    hreflang: String? = null,
    ping: String? = null,
    referrerpolicy: String? = null,
    rel: String? = null,
    target: String? = null,
    type: String? = null
) = content(name = "a", content = content, id = id, classes = classes, attributes = arrayOf(Pair("download", download), Pair("href", href), Pair("hreflang", hreflang), Pair("ping", ping), Pair("referrerpolicy", referrerpolicy), Pair("rel", rel), Pair("target", target), Pair("type", type)))

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
 * Image Map Area element. Represents an area inside an image map that has predefined clickable areas.
 *
 * @param alt Text Alternative to display on browsers that do not display images. Only required if [href] is set.
 * @param coords Details the coordinates of the shape attribute. Only required is [shape] is not default.
 * @param download If present, this attribute indicates that the link is used for downloading a resource.
 * @param href Target URL.
 * @param ping List of URLs to which POST-requests with the body 'PING' will be sent when clicked. Space-separated.
 * @param referrerpolicy String indicating which referrer to use when fetching the resource.Defaults to 'strict-origin-when-cross-origin'
 * @param rel Specifies the relationship of the target to this page. Space-separated list of link types. Only use if [href] is set.
 * @param shape The shape of the area. Defaults to 'default'.
 * @param target Defines the browsing context in which the URL should be traversed through. Defaults to '_self'. Only use if [href] is set.
 * @since 1.0.4
 */
fun ContainerTag.area(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    alt: String? = null,
    coords: String? = null,
    download: String? = null,
    href: String? = null,
    ping: String? = null,
    referrerpolicy: String? = null,
    rel: String? = null,
    shape: String? = null,
    target: String? = null
) = void(name = "area", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("alt", alt), Pair("coords", coords), Pair("download", download), Pair("href", href), Pair("ping", ping), Pair("referrerpolicy", referrerpolicy), Pair("rel", rel), Pair("shape", shape), Pair("target", target)))

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
 * Embed Audio Element. Used to embed sound content in documents.
 *
 * @param crossorigin Indicates whether or not to use CORS to fetch the audio.
 * @param preload Provides a hint to indicate what the best user experience could be.
 * @param src URL to the audio file.
 * @since 1.0.4
 */
fun ContainerTag.audio(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit,
    crossorigin: String? = null,
    preload: String? = null,
    src: String? = null
) = container(name = "audio", id = id, classes = classes, children = children, attributes = arrayOf(Pair("crossorigin", crossorigin), Pair("preload", preload), Pair("src", src)))

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
 * Document Base URL element. Specifies the base URL to use for all relative URLs in a document.
 *
 * @param href The base URL to be used throughout the document.
 * @param target The default browsing context to show the results of navigation in. Defaults to '_self'.
 * @since 1.0.4
 */
fun ContainerTag.base(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    href: String? = null,
    target: String? = null
) = void(name = "base", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("href", href), Pair("target", target)))

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
 * Bidirectional Text Override element. Overrides the directionality of text.
 *
 * @param dir The direction the text should be rendered in.
 * @since 1.0.4
 */
fun ContainerTag.bdo(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    dir: String? = null
) = content(name = "bdo", content = content, id = id, classes = classes, attributes = arrayOf(Pair("dir", dir)))

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
 * @param onafterprint Called the document has been printed.
 * @param onbeforeprint Called when printing of the document has been requested.
 * @param onbeforeunload Called when the document is about to be unloaded.
 * @param onblur Called when the document loses focus.
 * @param onerror Called when the document fails to load properly.
 * @param onfocus Called when the document receives focus.
 * @param onhashchange Called when the '#' part of the URL changes.
 * @param onlanguagechange Called when the preferred language is changed.
 * @param onload Called when the document is finished loading.
 * @param onmessage Called when the document receives a message.
 * @param onoffline Called when network connectivity is lost.
 * @param ononline Called when network connectivity is restored.
 * @param onpopstate Called when the user navigates session history.
 * @param onredo Called when the user moves forward in undo transaction history.
 * @param onresize Called when the document resizes.
 * @param onstorage Called when the storage area changes.
 * @param onundo Called when the user moves backwards in undo transaction history.
 * @param onunload Called when the document is about to be unloaded.
 * @since 1.0.0
 */
fun ContainerTag.body(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    onafterprint: String? = null,
    onbeforeprint: String? = null,
    onbeforeunload: String? = null,
    onblur: String? = null,
    onerror: String? = null,
    onfocus: String? = null,
    onhashchange: String? = null,
    onlanguagechange: String? = null,
    onload: String? = null,
    onmessage: String? = null,
    onoffline: String? = null,
    ononline: String? = null,
    onpopstate: String? = null,
    onredo: String? = null,
    onresize: String? = null,
    onstorage: String? = null,
    onundo: String? = null,
    onunload: String? = null,
    children: ContainerTag.() -> Unit
) = container(name = "body", id = id, classes = classes, children = children, attributes = arrayOf(Pair("onafterprint", onafterprint), Pair("onbeforeprint", onbeforeprint), Pair("onbeforeunload", onbeforeunload), Pair("onblur", onblur), Pair("onerror", onerror), Pair("onfocus", onfocus), Pair("onhashchange", onhashchange), Pair("onlanguagechange", onlanguagechange), Pair("onload", onload), Pair("onmessage", onmessage), Pair("onoffline", onoffline), Pair("ononline", ononline), Pair("onpopstate", onpopstate), Pair("onredo", onredo), Pair("onresize", onresize), Pair("onstorage", onstorage), Pair("onundo", onundo), Pair("onunload", onunload)))

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
 * @param form Form Id to associate this button with.
 * @param formaction URL that processes information submitted by this button. Overrides the `action` attribute on forms.
 * @param formenctype Specifies how to encode the form data to be submitted. Defaults to 'application/x-www-form-urlencoded'. Only applicable of submit button.
 * @param formmethod Specifies the HTTP method used to submit the form. Defaults to the attribute set in the parent form.
 * @param formtarget Indication of where to display the response. Defaults to '_self'.
 * @param name Name of the button.
 * @param popovertarget Id of the popover element to control.
 * @param popovertargetaction Specifies the action to be performed on the popover element.
 * @param type The behaviour of the button. Defaults to 'submit' if part of a form, 'button' otherwise.
 * @param value The value associated with the button.
 * @since 1.0.1
 */
fun ContainerTag.button(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    form: String? = null,
    formaction: String? = null,
    formenctype: String? = null,
    formmethod: String? = null,
    formtarget: String? = null,
    name: String? = null,
    popovertarget: String? = null,
    popovertargetaction: String? = null,
    type: String? = null,
    value: String? = null
) = content(name = "button", content = content, id = id, classes = classes, attributes = arrayOf(Pair("form", form), Pair("formaction", formaction), Pair("formenctype", formenctype), Pair("formmethod", formmethod), Pair("formtarget", formtarget), Pair("name", name), Pair("popovertarget", popovertarget), Pair("popovertargetaction", popovertargetaction), Pair("type", type), Pair("value", value)))

/**
 * Graphics Canvas element. Used to draw graphics using the canvas scripting API or WebGL.
 *
 * @param height Height of the coordinate space. Defaults to 150.
 * @param width Width of the coordinate space. Defaults to 300.
 * @since 1.0.4
 */
fun ContainerTag.canvas(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    height: String? = null,
    width: String? = null
) = content(name = "canvas", content = content, id = id, classes = classes, attributes = arrayOf(Pair("height", height), Pair("width", width)))

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
 * Table Column element. Defines a column within a table.
 *
 * @param span Number of consecutive columns the element span. Must be a positive integer. Defaults to 1.
 * @since 1.0.5
 */
fun ContainerTag.col(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    span: String? = null
) = void(name = "col", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("span", span)))

/**
 * Table Column Group element. Defines a group of columns within a table.
 *
 * @param span Number of consecutive columns the element spans. Must be a positive integer. Defaults to 1.
 * @since 1.0.5
 */
fun ContainerTag.colgroup(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    span: String? = null,
    children: ContainerTag.() -> Unit
) = container(name = "colgroup", id = id, classes = classes, children = children, attributes = arrayOf(Pair("span", span)))

/**
 * Data element. Links a piece of content with a machine-readable translation.
 *
 * @param value The machine-readable translation of the content.
 * @since 1.0.5
 */
fun ContainerTag.data(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    value: String? = null
) = content(name = "data", content = content, id = id, classes = classes, attributes = arrayOf(Pair("value", value)))

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
 * Deleted Text element. Represents a range of text that has been deleted from a document.
 *
 * @param cite Link to resource explaining the change.
 * @param datetime Time and date of the change. Must be a valid data string, with optional time.
 * @since 1.0.5
 */
fun ContainerTag.del(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    cite: String? = null,
    datetime: String? = null
) = content(name = "del", content = content, id = id, classes = classes, attributes = arrayOf(Pair("cite", cite), Pair("datetime", datetime)))

/**
 * Details Disclosure element. Disclosure widget in which information is only visible when the widget is toggled open.
 *
 * @since 1.0.5
 */
fun ContainerTag.details(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "details", id = id, classes = classes, children = children)

/**
 * Definition element. Indicates a term being defined within the context of a definition phrase or sentence.
 *
 * @param title If set, then this is the term being defined.
 * @since 1.0.5
 */
fun ContainerTag.dfn(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    title: String? = null
) = content(name = "dfn", content = content, id = id, classes = classes, attributes = arrayOf(Pair("title", title)))

/**
 * Dialog element. Represents a dialog box, or interactive components such as alerts, inspectors, or subwindows.
 *
 * @since 1.0.5
 */
fun ContainerTag.dialog(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "dialog", id = id, classes = classes, children = children)

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
 * Embed External Content element. Embeds external content at the specified point in the document.
 *
 * @param height The displayed height of the resource. In CSS Pixels. Must be an absolute value.
 * @param src URL of the embedded resource.
 * @param type The MIME Type.
 * @param width The displayed width of the resource. In CSS Pixels. Must be an absolute value.
 * @since 1.0.5
 */
fun ContainerTag.embed(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    height: String? = null,
    src: String? = null,
    type: String? = null,
    width: String? = null
) = void(name = "embed", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("height", height), Pair("src", src), Pair("type", type), Pair("width", width)))

/**
 * Field Set element. Groups several controls as well as labels within a web form.
 *
 * @param form Id attribute of the form this element is part of.
 * @param name The name associated with this element.
 * @since 1.0.5
 */
fun ContainerTag.fieldset(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    form: String? = null,
    name: String? = null,
    children: ContainerTag.() -> Unit
) = container(name = "fieldset", id = id, classes = classes, children = children, attributes = arrayOf(Pair("form", form), Pair("name", name)))

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
 * @param accept_charset List of character encodings that the server accepts. Space-separated.
 * @param autocomplete Whether or not input elements can have their values autocompleted by the browser. Either `off` or `on`.
 * @param name The name of the form.
 * @param rel Controls the annotations and kind of links the form can create.
 * @param action The URL that processes the form submission
 * @param enctype MIME Type in which the form is submitted.
 * @param method The HTTP method to submit the form with
 * @param target Where to display the response of the form. Defaults to `_self`.
 * @since 1.0.1
 */
fun ContainerTag.form(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    accept_charset: String? = null,
    autocomplete: String? = null,
    name: String? = null,
    rel: String? = null,
    action: String? = null,
    enctype: String? = null,
    method: String? = null,
    target: String? = null,
    children: ContainerTag.() -> Unit
) = container(name = "form", id = id, classes = classes, children = children, attributes = arrayOf(Pair("accept-charset", accept_charset), Pair("autocomplete", autocomplete), Pair("name", name), Pair("rel", rel), Pair("action", action), Pair("enctype", enctype), Pair("method", method), Pair("target", target)))

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
 * Inline Frame element. Represents another HTML page being embedded into the current one.
 *
 * @param allow Specifies a Permissions Policy for this frame.
 * @param allowfullscreen If set to `true`, the iframe can activate fullscreen mode. Replaced by [allow], and setting `fullscreen`.
 * @param height The height of the frame, in CSS pixels. Defaults to 150.
 * @param loading How the frame should be loaded. Either `lazy` or `eager`.
 * @param name The name for the embedded page.
 * @param referrerpolicy Which referrer to send when fetching the frame source.
 * @param sandbox Sets some of the properties of the frame sandbox.
 * @param src The URL to embed.
 * @param srcdoc Inline HTML to embed, overriding [src].
 * @param width The width of the frame, in CSS pixels. Defaults to 300.
 * @since 1.0.6
 */
fun ContainerTag.iframe(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    allow: String? = null,
    allowfullscreen: String? = null,
    height: String? = null,
    loading: String? = null,
    name: String? = null,
    referrerpolicy: String? = null,
    sandbox: String? = null,
    src: String? = null,
    srcdoc: String? = null,
    width: String? = null
) = content(name = "iframe", content = content, id = id, classes = classes, attributes = arrayOf(Pair("allow", allow), Pair("allowfullscreen", allowfullscreen), Pair("height", height), Pair("loading", loading), Pair("name", name), Pair("referrerpolicy", referrerpolicy), Pair("sandbox", sandbox), Pair("src", src), Pair("srcdoc", srcdoc), Pair("width", width)))

/**
 * Image Embed element. Embeds an image into the document.
 *
 * @param alt Alternative text description of the image
 * @param crossorigin Whether or not the image fetching should be done using CORS.
 * @param decoding Browser hint to image decoding. Either `sync`, `async`, or `auto`. Defaults to auto.
 * @param elementtiming Makes the value become an identifier for the PerformanceElementTiming API.
 * @param height Intrinsic image height, in pixels. Integer without unit.
 * @param loading Specifies the way the image should be loaded. Either `eager` or `lazy`. Defaults to `eager`.
 * @param referrerpolicy Indication to which referrer to use when fetching the resource.
 * @param sizes Indication of source set sizes. Comma-separated.
 * @param src The image URL
 * @param srcset List of possible image sources for the browser to use. Comma-separated.
 * @param width Intrinsic image width, in pixels. Integer without unit.
 * @param usemap Partial URL of the image map associated with the element.
 * @since 1.0.2
 */
fun ContainerTag.img(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    alt: String? = null,
    crossorigin: String? = null,
    decoding: String? = null,
    elementtiming: String? = null,
    height: String? = null,
    loading: String? = null,
    referrerpolicy: String? = null,
    sizes: String? = null,
    src: String? = null,
    srcset: String? = null,
    width: String? = null,
    usemap: String? = null
) = void(name = "img", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("alt", alt), Pair("crossorigin", crossorigin), Pair("decoding", decoding), Pair("elementtiming", elementtiming), Pair("height", height), Pair("loading", loading), Pair("referrerpolicy", referrerpolicy), Pair("sizes", sizes), Pair("src", src), Pair("srcset", srcset), Pair("width", width), Pair("usemap", usemap)))

/**
 * Form Input element. Used to create interactive controls for web-based forms.
 *
 * @param accept Hints at the expected file type. Only valid if [type] is `file`.
 * @param alt Text representation of the image. Only valid if [type] is `image`.
 * @param autocomplete Whether or not to use form autofill. Only valid if [type] is not `checkbox`, `radio`, or a button.
 * @param capture Media capture input method. Only valid if [type] is `file`.
 * @param dirname Name of the field to use for sending. Only valid if [type] is `search` or `text`.
 * @param form Id of the form this element belongs to.
 * @param formaction URL to use for form submission. Only valid if [type] is `image` or `submit`.
 * @param formenctype Form data encoding type used for submission. Only valid if [type] is `image` or `submit`.
 * @param formmethod HTTP Method used for submission. Only valid if [type] is `image` or `submit`.
 * @param formnovalidate Whether or not to bypass form validation. Only valid if [type] is `image` or `submit`.
 * @param formtarget Which browsing context to use for submission. Only valid if [type] is `image` or `submit`.
 * @param height The height of the image. Only valid if [type] is `image`.
 * @param inputmode Provides a hint to browsers of the type of virtual keyboard to use.
 * @param list Value of the Id attribute of the datalist of autocomplete options. Only valid if [type] is not `hidden`, `password`, `checkbox`, `radio`, or a button.
 * @param max Maximum value. Only valid if [type] is `date`, `month`, `week`, `time`, `datetime-local`, `number`, or `range`.
 * @param maxlength Maximum length, in number of characters. Only valid if [type] is `text`, `search`, `url`, `tel`, `email`, or `password`.
 * @param min Minimum value. Only valid if [type] is `date`, `month`, `week`, `time`, `datetime-local`, `number`, or `range`.
 * @param minlength Minimum length, in number of characters. Only valid if [type] is `text`, `search`, `url`, `tel`, `email`, or `password`.
 * @param name The name of the control.
 * @param pattern Pattern that the value has to match. Only valid if [type] is `text`, `search`, `url`, `tel`, `email`, or `password`.
 * @param placeholder Text to show if no value is present. Only valid if [type] is `text`, `search`, `url`, `tel`, `email`, `password`, or `number`.
 * @param popovertarget Designates a button element as a popover control. Only valid if [type] is `button`.
 * @param popovertargetaction Action that the popover control should perform. Only valid if [type] is `button`.
 * @param size Control size. Only valid if [type] is `text`, `search`, `url`, `tel`, `email`, or `password`.
 * @param src Src attribute of the image. Only valid if [type] is `image`.
 * @param step Incremental values which are valid. Only valid if [type] is `date`, `month`, `week`, `time`, `datetime-local`, `number`, or `range`.
 * @param tabindex Whether or not the element should be focusable, and if it should participate in keyboard navigation.
 * @param title Advisory information for the element. May be represented as a tooltip.
 * @param type Form control type.
 * @param value Initial control value. Only valid if [type] is not `image`.
 * @param width Image width attribute. Only valid if [type] is `image`.
 * @since 1.0.6
 */
fun ContainerTag.input(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    accept: String? = null,
    alt: String? = null,
    autocomplete: String? = null,
    capture: String? = null,
    dirname: String? = null,
    form: String? = null,
    formaction: String? = null,
    formenctype: String? = null,
    formmethod: String? = null,
    formnovalidate: String? = null,
    formtarget: String? = null,
    height: String? = null,
    inputmode: String? = null,
    list: String? = null,
    max: String? = null,
    maxlength: String? = null,
    min: String? = null,
    minlength: String? = null,
    name: String? = null,
    pattern: String? = null,
    placeholder: String? = null,
    popovertarget: String? = null,
    popovertargetaction: String? = null,
    size: String? = null,
    src: String? = null,
    step: String? = null,
    tabindex: String? = null,
    title: String? = null,
    type: String? = null,
    value: String? = null,
    width: String? = null
) = void(name = "input", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("accept", accept), Pair("alt", alt), Pair("autocomplete", autocomplete), Pair("capture", capture), Pair("dirname", dirname), Pair("form", form), Pair("formaction", formaction), Pair("formenctype", formenctype), Pair("formmethod", formmethod), Pair("formnovalidate", formnovalidate), Pair("formtarget", formtarget), Pair("height", height), Pair("inputmode", inputmode), Pair("list", list), Pair("max", max), Pair("maxlength", maxlength), Pair("min", min), Pair("minlength", minlength), Pair("name", name), Pair("pattern", pattern), Pair("placeholder", placeholder), Pair("popovertarget", popovertarget), Pair("popovertargetaction", popovertargetaction), Pair("size", size), Pair("src", src), Pair("step", step), Pair("tabindex", tabindex), Pair("title", title), Pair("type", type), Pair("value", value), Pair("width", width)))

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
) = content(name = "progress", content = content, id = id, classes = classes, attributes = arrayOf(Pair("max", max), Pair("value", value)))

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
 * Table element. Represents tabular data, comprised of rows and columns
 *
 * @since 1.0.3
 */
fun ContainerTag.table(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "table", id = id, classes = classes, children = children)

/**
 * Table Body element. Encapsulates a set of table rows.
 *
 * @since 1.0.3
 */
fun ContainerTag.tbody(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "tbody", id = id, classes = classes, children = children)

/**
 * Table Data Cell element. Defines a cell of a table that contains data.
 *
 * @param colspan How many columns the cell extends. Defaults to 1, must be a non-negative integer.
 * @param headers List of strings corresponding to the id attribute of the `<th>` elements that apply. Space-separated.
 * @param rowspan How many rows the cell extends. Defaults to 1. If 0, it extends until the end of the table section.
 * @since 1.0.3
 */
fun ContainerTag.td(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    colspan: String? = null,
    headers: String? = null,
    rowspan: String? = null
) = content(name = "td", content = content, id = id, classes = classes, attributes = arrayOf(Pair("colspan", colspan), Pair("headers", headers), Pair("rowspan", rowspan)))

/**
 * Content Template element. Holds HTML that is not to be rendered immediately when a page is loaded, but instantiated using JavaScript.
 *
 * @since 1.0.3
 */
fun ContainerTag.template(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "template", id = id, classes = classes, children = children)

/**
 * Table Foot element. Defines a set of rows summarizing the columns of the table.
 *
 * @since 1.0.3
 */
fun ContainerTag.tfoot(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "tfoot", id = id, classes = classes, children = children)

/**
 * Table Header element. Defines a cell as the header of a group of cells.
 *
 * @param abbr Short abbreviated description of cell content.
 * @param colspan How many columns the cell extends. Non-negative integer. Defaults to 1.
 * @param headers IDs to applicable `th` elements. Space-separated
 * @param rowspan How many rows the cell extends. Non-negative integer. Defaults to 1.
 * @param scope Cells that the element relates to. Enumerated attribute.
 * @since 1.0.6
 */
fun ContainerTag.th(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    abbr: String? = null,
    colspan: String? = null,
    headers: String? = null,
    rowspan: String? = null,
    scope: String? = null
) = content(name = "th", content = content, id = id, classes = classes, attributes = arrayOf(Pair("abbr", abbr), Pair("colspan", colspan), Pair("headers", headers), Pair("rowspan", rowspan), Pair("scope", scope)))

/**
 * Table Head element. Defines a set of rows defining the head of the columns of the table.
 *
 * @since 1.0.3
 */
fun ContainerTag.thead(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "thead", id = id, classes = classes, children = children)

/**
 * (Date) Time element. Represents a specific period in time.
 *
 * @param datetime Machine-readable format of the date.
 * @since 1.0.6
 */
fun ContainerTag.time(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    datetime: String? = null
) = content(name = "time", content = content, id = id, classes = classes, attributes = arrayOf(Pair("datetime", datetime)))

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
 * Table Row element. Defines a row of cells in a table.
 *
 * @since 1.0.3
 */
fun ContainerTag.tr(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "tr", id = id, classes = classes, children = children)

/**
 * Embed Text Track element. Used as a child on media elements. Lets you specify timed text tracks, for subtitles.
 *
 * @param kind How it's meant to be used. Defaults to `subtitles`.
 * @param label User-readable title of the text track.
 * @param src URL to the .vtt file
 * @param srclang Language of the subtitles.
 * @since 1.0.6
 */
fun ContainerTag.track(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    kind: String? = null,
    label: String? = null,
    src: String? = null,
    srclang: String? = null
) = void(name = "track", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("kind", kind), Pair("label", label), Pair("src", src), Pair("srclang", srclang)))

/**
 * Unarticulated Annotation element. Represents a span of inline text which should be rendered in a way that indicates it has a non-textual annotation.
 *
 * Usually rendered as underlined text.
 *
 * @since 1.0.3
 */
fun ContainerTag.u(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "u", content = content, id = id, classes = classes)

/**
 * Unordered List element. Represents an unordered list of items.
 *
 * Usually rendered as a bulleted list.
 *
 * @since 1.0.3
 */
fun ContainerTag.ul(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "ul", id = id, classes = classes, children = children)

/**
 * Variable element. Represents the name of a variable in a mathematical expression or programming context.
 *
 * Usually rendered as italicized text.
 *
 * @since 1.0.3
 */
fun ContainerTag.`var`(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "var", content = content, id = id, classes = classes)

/**
 * Video Embed element. Embeds a media player into the page, that supports video playback.
 *
 * @param crossorigin Indicates whether or not to use CORS to fetch the related video.
 * @param height The height of the player, in CSS pixels.
 * @param poster URL to an image to be shown whilst the video is loading.
 * @param preload Provides a hint about what the site's author thinks the best user experience will be.
 * @param src URL of the video file.
 * @param width Width of the player, in CSS pixels.
 * @since 1.0.6
 */
fun ContainerTag.video(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    crossorigin: String? = null,
    height: String? = null,
    poster: String? = null,
    preload: String? = null,
    src: String? = null,
    width: String? = null,
    children: ContainerTag.() -> Unit
) = container(name = "video", id = id, classes = classes, children = children, attributes = arrayOf(Pair("crossorigin", crossorigin), Pair("height", height), Pair("poster", poster), Pair("preload", preload), Pair("src", src), Pair("width", width)))

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