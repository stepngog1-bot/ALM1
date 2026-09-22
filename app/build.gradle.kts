plugins { id("com.android.application") }

android {
    namespace = "com.m3e.almas.realv5"
    compileSdk = 36
    buildToolsVersion = "35.0.0"
    defaultConfig {
        applicationId = "com.m3e.almas.realv5"
        minSdk = 26
        targetSdk = 36
        versionCode = 80
        versionName = "1.16.8-real-offline-visual-match"
    }
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
