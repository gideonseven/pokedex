plugins {
    id("gt.pokedex.android.library")
    id("gt.pokedex.android.library.compose")
    alias(libs.plugins.kotlinx.serialization)
    id("gt.pokedex.android.hilt")
    id("gt.pokedex.spotless")
}

android {
    namespace = "com.gt.pokedex.core.navigation"
}

dependencies {
    implementation(projects.core.model)

    implementation(libs.androidx.core)
    implementation(libs.kotlinx.coroutines.android)

    // Navigation3
    api(libs.androidx.navigation3.runtime)
    api(libs.androidx.navigation3.ui)

    // json parsing
    implementation(libs.kotlinx.serialization.json)
}