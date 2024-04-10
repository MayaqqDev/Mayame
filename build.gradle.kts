plugins {
    `java-gradle-plugin`
    kotlin("jvm") version "1.9.22"
}

group = "dev.mayaqq"
version = "1.0.0"
description = "Automatically update your readmes on all sites."

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

gradlePlugin {
    website = "https://github.com/MayaqqDev/Mayame"
    vcsUrl = "https://github.com/MayaqqDev/Mayame"
    testSourceSet(sourceSets["test"])

    plugins.create("mayame") {
        id = "dev.mayaqq.mayame"
        implementationClass = "dev.mayaqq.mayame.Mayame"
        displayName = "Mayame"
        description = project.description
        version = project.version
        tags = listOf("minecraft", )
    }
}