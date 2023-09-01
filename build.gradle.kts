plugins {
    id("java")
}

group = "QA1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("net.serenity-bdd:serenity-core:3.6.23")
    implementation("net.serenity-bdd:serenity-junit:3.6.23")
    testImplementation ("net.serenity-bdd:serenity-cucumber:3.6.23")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:3.6.23")
    implementation("net.serenity-bdd:serenity-screenplay:3.6.23")
    implementation("org.apache.maven.plugins:maven-compiler-plugin:3.11.0")
    implementation("net.serenity-bdd.maven.plugins:serenity-maven-plugin:3.6.23")

}

tasks.test {
    systemProperty("file.encoding","utf-8")
    include("QA1.runners.RunnerTest")
}