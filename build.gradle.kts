plugins {
    kotlin("jvm") version "1.9.0"
    id("signing")
    id("maven-publish")
    id("org.jetbrains.dokka") version "1.8.20"
}

group = "me.thealgorithm476"
version = "1.0.6"

repositories {
    mavenCentral()

    maven {
        name = "Octan Repo"
        url = uri("https://maven.octandevelopment.com/releases/")
    }
}

dependencies {}

kotlin {
    jvmToolchain(17)
}

task<Jar>("sourceJar") {
    from(sourceSets.main.get().allSource)
    archiveClassifier.set("sources")
}

tasks.dokkaHtml.configure {
    outputDirectory.set(buildDir.resolve("dokka"))
}

task<Jar>("dokkaJar") {
    from(tasks.dokkaHtml.get().outputDirectory)
    archiveClassifier.set("javadoc")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["kotlin"])

            artifact(tasks["sourceJar"])
            artifact(tasks["dokkaJar"])
        }
    }

    repositories {
        maven {
            name = "octanrepo"
            url = uri("https://maven.octandevelopment.com/releases")
            credentials(PasswordCredentials::class)

            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
}

signing {
    sign(publishing.publications["maven"])
}