plugins { id("com.android.application") }

android {
    namespace = "com.m3e.almas.offlinev4"
    compileSdk = 36
    buildToolsVersion = "35.0.0"
    defaultConfig {
        applicationId = "com.m3e.almas.offlinev4"
        minSdk = 26
        targetSdk = 36
        versionCode = 40
        versionName = "1.16.4-v4"
    }
    buildTypes {
        release { isMinifyEnabled = false }
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
