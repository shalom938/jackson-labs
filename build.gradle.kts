plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.sh.samples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.10.5.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.10.5")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}