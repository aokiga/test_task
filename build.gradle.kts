plugins {
    kotlin("jvm") version "1.3.72"
    application
    id("org.openjfx.javafxplugin") version "0.0.8"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClassName = "MainKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("no.tornado:tornadofx:1.7.20")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

javafx {
    version = "13"
    modules = mutableListOf("javafx.controls", "javafx.fxml", "javafx.base", "javafx.media", "javafx.graphics")
}