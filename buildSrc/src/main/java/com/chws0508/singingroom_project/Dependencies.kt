package com.chws0508.singingroom_project

object Versions {
    const val kotlin = "1.7.10"
    const val agp = "7.2.1"
    const val ksp = "1.7.10-1.0.6"
    const val hilt = "2.42"
    const val jvmTarget = "1.8"
    const val material = "1.6.0"
    const val sceneView = "0.9.0"
    const val appcompat = "1.4.1"
    const val androidxCore = "1.8.0"
    const val androidxFragment = "1.5.0"
    const val constraintLayout = "2.1.4"
    const val androidxNavigation = "2.5.0"
    const val androidxLifecycle = "2.5.0"
    const val androidxWork = "2.7.1"
    const val androidxRoom = "2.4.3"
    const val datastore = "1.0.0"
}

object Libraries {
    const val agp = "com.android.tools.build:gradle:${Versions.agp}"
    const val ksp = "com.google.devtools.ksp:symbol-processing-api:${Versions.ksp}"
    const val kotlin_gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin_serialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    const val navigation_safeargsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidxNavigation}"
    const val hilt_plugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val gson = "com.google.code.gson"
    const val hilt_android = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hilt_compiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val androidx_core = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
}