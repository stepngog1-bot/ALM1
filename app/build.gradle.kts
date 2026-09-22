plugins { id("com.android.application") }

android {
    namespace = "com.m3e.almas.realv5"
    compileSdk = 36
    buildToolsVersion = "35.0.0"
    defaultConfig {
        applicationId = "com.m3e.almas.realv5"
        minSdk = 26
        targetSdk = 36
        versionCode = 60
        versionName = "1.16.6-real-offline-compatible"
    }
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
