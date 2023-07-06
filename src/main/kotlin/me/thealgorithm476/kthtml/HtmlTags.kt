package me.thealgorithm476.kthtml

fun html(id: String? = null, classes: Array<String> = emptyArray(), xmlns: String? = null, lang: String? = null, children: ContainerTag.() -> Unit): HtmlTag {
    val tag: HtmlTag = HtmlTag(id = id, classes = classes, xmlns = xmlns, lang = lang)
    tag.children()

    return tag
}

fun ContainerTag.a(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    href: String? = null,
    target: String? = null,
    type: String? = null
) = content(name = "a", content = content, id = id, classes = classes, attributes = arrayOf(Pair("href", href), Pair("target", target), Pair("type", type)))

fun ContainerTag.abbr(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
    title: String? = null
) = content(name = "abbr", content = content, id = id, classes = classes, attributes = arrayOf(Pair("title", title)))

fun ContainerTag.b(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "b", content = content, id = id, classes = classes)

fun ContainerTag.body(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "body", id = id, classes = classes, children = children)

fun ContainerTag.br(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray()
) = void(name = "br", slash = slash, id = id, classes = classes)

fun ContainerTag.div(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "div", id = id, classes = classes, children = children)

fun ContainerTag.h1(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h1", content = content, id = id, classes = classes)

fun ContainerTag.h2(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h2", content = content, id = id, classes = classes)

fun ContainerTag.h3(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h3", content = content, id = id, classes = classes)

fun ContainerTag.h4(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h4", content = content, id = id, classes = classes)

fun ContainerTag.h5(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h5", content = content, id = id, classes = classes)

fun ContainerTag.h6(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = content(name = "h6", content = content, id = id, classes = classes)

fun ContainerTag.head(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "head", id = id, classes = classes, children = children)

fun ContainerTag.hr(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray()
) = void(name = "hr", slash = slash, id = id, classes = classes)

fun ContainerTag.i(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "i", content = content, id = id, classes = classes)

fun ContainerTag.link(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    rel: String? = null,
    href: String? = null
) = void(name = "link", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("rel", rel), Pair("href", href)))

fun ContainerTag.main(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "main", id = id, classes = classes, children = children)

fun ContainerTag.meta(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
    charset: String? = null,
    content: String? = null,
    http_equiv: String? = null,
    name: String? = null
) = void(name = "meta", slash = slash, id = id, classes = classes, attributes = arrayOf(Pair("charset", charset), Pair("name", name), Pair("http-equiv", http_equiv), Pair("content", content)))

fun ContainerTag.nav(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "nav", id = id, classes = classes, children = children)

fun ContainerTag.p(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "p", content = content, id = id, classes = classes)

fun ContainerTag.p(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "p", id = id, classes = classes, children = children)

fun ContainerTag.svg(
    id: String? = null,
    classes: Array<String> = emptyArray(),
    children: ContainerTag.() -> Unit
) = container(name = "svg", id = id, classes = classes, children = children)

fun ContainerTag.title(
    content: String = "",
    id: String? = null,
    classes: Array<String> = emptyArray()
) = content(name = "title", content = content, id = id, classes = classes)

fun ContainerTag.wbr(
    slash: Boolean = false,
    id: String? = null,
    classes: Array<String> = emptyArray(),
) = void(name = "wbr", slash = slash, id = id, classes = classes)