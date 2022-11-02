plugins {
    id("java")
}

group = "me.heroostech.exampleextension"
version = "v1.0.0"

repositories {
    mavenLocal()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly(libs.minestom)
    compileOnly(libs.citystom)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}