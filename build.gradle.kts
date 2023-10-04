plugins {
    kotlin("multiplatform") version "1.9.0"
}

group = "org.example"
version = "1.0-DEV"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

kotlin {

    // implement project targets
    // https://kotlinlang.org/docs/multiplatform-discover-project.html#targets
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }

        testRuns.named("test") {
            executionTask.configure {
                useJUnitPlatform()
            }
        }
    }

    // implement project sourceSets
    // https://kotlinlang.org/docs/multiplatform-discover-project.html#source-sets
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}