plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}



dependencies{


    // retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    // retrofit serialization converter
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0")


    // retrofit adapters
    implementation ("com.github.skydoves:retrofit-adapters-result:1.0.9")


    //coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")

    //serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

    // annotation
    implementation("androidx.annotation:annotation:1.7.1")



}