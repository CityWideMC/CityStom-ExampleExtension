plugins {
    id("java")
}

group = "xyz.citywide.exampleextension"
version = "v1.0.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("com.github.Minestom:Minestom:91a344aa92")
    compileOnly("com.github.CityWideMC:CityStom:8f9625559f")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
}