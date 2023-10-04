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

    sourceSets {
        val androidMain by getting
        val commonMain by getting
    }
}

android {
    namespace = "org.example.shared"
    compileSdk = 33
}