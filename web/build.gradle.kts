plugins {
    kotlin("multiplatform")
}

kotlin {

    wasm {
        binaries.executable()
        browser {
            commonWebpackConfig(
                Action {
                    outputFileName = "web.js"
                }
            )
        }
    }

    sourceSets {
        val wasmMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}
