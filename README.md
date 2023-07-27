# KtHTML
An easy, straight-forward Kotlin DSL for generating dynamic HTML.

## Installing and using KtHTML
KtHTML can easily be integrated into existing projects, and it is even easier to use.

### Prerequisites
To use KtHTML in your project, it will need following settings to work properly:
- Java 17 or higher
  - KtHTML is built on the Kotlin/JVM platform, and does not work on the JS or Native platform.
- Kotlin 1.9.0 or higher
- Gradle or Maven, or any other build tool that accepts maven dependencies
  - Gradle is prefered
  - Maven is verified to work too

If you project complies to the requirements lined out above, you can move on to the next step.

### Enabling the OctanDevelopment repository
The OctanDevelopment repo is the central place where all my tools are stored, and KtHTML is no exception.  
The repo and tool can be added using following snippets:

#### Gradle (Kotlin DSL)
```kt
repositories {
    maven {
        name = "octan"
        url = uri("https://maven.octandevelopment.com/releases/")
    }
}
```
```kt
dependencies {
    implementation("me.thealgorithm476:kthtml:1.0.5")
}
```
```kt
kotlin {
    jvmToolchain(17)
}
```

#### Maven
```xml
<repository>
    <id>octan</id>
    <url>https://maven.octandevelopment.com/releases/</url>
</repository>
```
```xml
<dependency>
    <groupId>me.thealgorithm476</groupId>
    <artifactId>kthtml</artifactId>
    <version>1.0.5</version>
</dependency>
```

### Using KtHTML
A basic example:
```kt
import me.thealgorithm476.kthtml.HtmlTag
import me.thealgorithm476.kthtml.body
import me.thealgorithm476.kthtml.head
import me.thealgorithm476.kthtml.html
import me.thealgorithm476.kthtml.p
import me.thealgorithm476.kthtml.title

fun main() {
    val html: HtmlTag = html(lang = "en") {
        head {
            title("Intro to KtHTML")
        }

        body {
            p("Hello, World!")
        }
    }

    println(html.toString())
}
```
This snippet will have the following output:
```html
<html lang="en">
    <head>
        <title>Intro to KtHTML</title>
    </head>
    <body>
        <p>Hello, World!</p>
    </body>
</html>
```
KtHTML will automatically take care of things like indentation, ids, styles, classes, and defined HTML parameters.  
You can also generate a 'minified' HTML snippet, by using `toString(minified = true)` on the `HtmlTag`. When doing so, this will be your output:
```html
<html lang="en"><head><title>Intro to KtHTML</title></head><body><p>Hello, World!</p></body></html>
```

Now a more complex example:
```kt
import me.thealgorithm476.kthtml.HtmlTag
import me.thealgorithm476.kthtml.body
import me.thealgorithm476.kthtml.head
import me.thealgorithm476.kthtml.html
import me.thealgorithm476.kthtml.link
import me.thealgorithm476.kthtml.main
import me.thealgorithm476.kthtml.meta
import me.thealgorithm476.kthtml.p
import me.thealgorithm476.kthtml.title

fun main() {
    val html: HtmlTag = html(lang = "en") {
        head {
            title("Intro to KtHTML")
            meta(charset = "UTF-8")
            meta(name = "viewport", content = "width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0")
            meta(http_equiv = "X-UA-Compatible", content = "ie=edge")
            link(rel = "stylesheet", href = "/my/css/stylesheet.css")
        }

        body {
            main(id = "main-page-body", classes = arrayOf("centered")) {
                p("Hello, World!", classes = arrayOf("text-big", "text-centered", "color-red", "text-underline", "bg-blue"))
            }
        }
    }

    println(html.toString())
}
```
Will yield the following output:
```html
<html lang="en">
    <head>
        <title>Intro to KtHTML</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="/my/css/stylesheet.css">
    </head>
    <body>
        <main id="main-page-body" class="centered">
            <p class="text-big text-centered color-red text-underline bg-blue">Hello, World!</p>
        </main>
    </body>
</html>
```
As you can see, KtHTML is capable of generating some serious HTML pages, all using a simple, intuitive Kotlin DSL.

### Building
Building is as simple as running `./gradlew build`. It will build the project, and the JAR can be found in 'build/libs/kthtml-version.jar'. You can also generate the sources by running `./gradlew sourceJar`, or the documentation using `./gradlew dokkaHtml`.  
You can also download pre-built JARs on the [OctanDevelopment Maven](https://maven.octandevelopment.com), under `me.thealgorithm476:kthtml`

### Features
- Kotlin DSL for generating the HTML in an easy way
- Support for classes and ids

### Drawbacks
- Feature-limited
  - KtHTML is quite a new project, which means that it is currently a bit lacking in features
  - Currently does not have a lot of tags
  - Does not yet support all parameters for all tags
- No manipulation
  - At this point, it's not possible to manipulate an existing HTML structure. It can also not yet parse HTML into a KtHTML Tag structure.

### Planned features
- Adding support for the entire HTML5 spec
  - This includes all tags, and all parameters of these tags
- Adding support to parse HTML
- Modifying an existing tag structure, to add, modify, or remove parts from an already existing tree
  - This would make component-style structuring possible

### Contributing
Contributions are always welcome! Please open a pull request to discuss what you want to see changed.

### Credits
Much of the KtHTML documentation, especially the comments regarding HTML tags, are inspired by the [MDN Web Docs](https://developer.mozilla.org/).