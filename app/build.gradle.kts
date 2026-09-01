plugins {
    id("gt.pokedex.android.application")
    id("gt.pokedex.android.application.compose")
    id("gt.pokedex.android.hilt")
    id("gt.pokedex.spotless")
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.baselineprofile)
    alias(libs.plugins.hotswan.compiler)
}

android {
    namespace = "com.gt.pokedex"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.gt.pokedex"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.tooling)

    //cores
    implementation(projects.core.designsystem)
    implementation(projects.core.navigation)
}