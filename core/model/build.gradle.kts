
plugins {
    id("gt.pokedex.android.library")
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.ksp)
    id("gt.pokedex.spotless")
}

android {
    namespace = "com.gt.pokedex.core.model"
}


dependencies {
    // compose stable marker
    compileOnly(libs.compose.stable.marker)

    // Kotlin Serialization for Json
    implementation(libs.kotlinx.serialization.json)

    // kotlinx
    api(libs.kotlinx.immutable.collection)
}