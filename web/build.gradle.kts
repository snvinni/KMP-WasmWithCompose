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
                api(project(":shared"))
            }
        }

        val wasmMain by getting
    }
}

compose.experimental {
    web.application {}
}