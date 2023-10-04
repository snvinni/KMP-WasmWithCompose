plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

group = "org.example"
version = "1.0-DEV"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

kotlin {

    androidTarget()

    wasm {
        binaries.executable()
        browser {
            commonWebpackConfig(
                Action {
                    outputFileName = "shared.js"
                }
            )
        }
    }

    sourceSets {
        val androidMain by getting
        val commonMain by getting
        val wasmMain by getting
    }
}

android {
    namespace = "org.example.shared"
    compileSdk = 33
}