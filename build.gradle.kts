plugins {
    java
    id("org.jetbrains.kotlin.jvm") version "1.5.31"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation (files("libs/socis-1.0.2.jar"))
    implementation (files("libs/kaling.jar"))
    implementation (files("libs/gson-2.9.0.jar"))
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("org.jsoup:jsoup:1.14.1")
    implementation("org.mozilla:rhino:1.7.14")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest()
        }
    }
}

application {
    mainClass.set("Kakao.AppKt")
}
