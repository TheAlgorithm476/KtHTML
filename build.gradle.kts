plugins {
    kotlin("jvm") version "1.8.22"
    id("signing")
    id("maven-publish")
}

group = "me.thealgorithm476"
version = "1.0.0"

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

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["kotlin"])
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