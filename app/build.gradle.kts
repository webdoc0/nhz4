plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "ir.nhzalborz.app"
    compileSdk = 34
    defaultConfig {
        applicationId = "ir.nhzalborz.app"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    signingConfigs {
        create("release") {
            storeFile = file("nhzalborz.jks")
            storePassword = "nhz123456"
            keyAlias = "nhzalborz"
            keyPassword = "nhz123456"
            enableV1Signing = true
            enableV2Signing = true
            enableV3Signing = true
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
        }
        debug {
            signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity-ktx:1.9.1")
}
