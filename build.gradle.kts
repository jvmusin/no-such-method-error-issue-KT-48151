plugins {
    java
    kotlin("jvm") version "1.5.21"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:4.6.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}