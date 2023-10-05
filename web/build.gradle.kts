import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

@OptIn(ExperimentalWasmDsl::class)
kotlin {

    wasm {

        // Used in load.mjs
        moduleName = "webAppModule"

        binaries.executable()

        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":shared"))

                // Compose
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.ui)
                implementation(compose.material)
            }
        }

        val wasmMain by getting
    }
}

compose.experimental {
    web.application {}
}