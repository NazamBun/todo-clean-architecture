plugins {
    alias(libs.plugins.kotlin.jvm)
}

java {
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

dependencies {
    // Kotlin stdlib vient avec le plugin
    // (Optionnel) Coroutines si tu en utilises dans tes UseCases
    // implementation(libs.kotlinx.coroutines.core)

    testImplementation(libs.junit)
}