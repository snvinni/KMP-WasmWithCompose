plugins {
    kotlin("multiplatform") version "1.9.0" apply false
    kotlin("android") version "1.9.0" apply false
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.compose") version "1.4.0-dev-wasm09" apply false
}

group = "org.example"
version = "1.0-DEV"

allprojects {
    repositories {
        google()
        mavenCentral()

        // Experimental Compose for Wasm
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }
}