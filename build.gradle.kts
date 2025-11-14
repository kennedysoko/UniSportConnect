// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Register the plugins on the project. 
    // In this file, we provide the version and set apply false, so each module can apply it.
    id("com.android.application") version "8.5.0" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}
