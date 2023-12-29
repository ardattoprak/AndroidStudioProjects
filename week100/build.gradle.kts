
buildscript {
    repositories {
        google()
        mavenCentral()

    }
    dependencies {
        classpath ("com.google.gms:google-services:4.3.13")
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false // hocada 7.2.2
    id ("com.android.library") version  "7.2.2" apply false
}