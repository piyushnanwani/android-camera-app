plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.piyush.cameraapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.piyush.cameraapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
//    val cameraxVersion = "1.3.4"
//    implementation("androidx.camera:camera-core:$cameraxVersion")
//    implementation("androidx.camera:camera-camera2:$cameraxVersion")
//    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
//    implementation("androidx.camera:camera-viewfinder:$cameraxVersion")
//    implementation("androidx.camera:camera-view:$cameraxVersion")
//    implementation("androidx.camera:camera-extensions:$cameraxVersion")
    // For saving images to files
    implementation("androidx.core:core-ktx:1.9.0")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.camera.camera2)
    implementation(libs.androidx.camera.core)
    implementation(libs.androidx.camera.extensions)
    implementation(libs.androidx.camera.lifecycle)
    implementation(libs.androidx.camera.view)
    implementation(libs.androidx.camera.viewfinder)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}