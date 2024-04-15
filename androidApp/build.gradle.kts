plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.jenyasubbotina.bookexchanger.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.jenyasubbotina.bookexchanger.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
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
    implementation(projects.shared)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.retrofit3)
    implementation(libs.retrofit.gson)
    implementation("io.coil-kt:coil-compose:2.2.2")
    implementation(libs.androidx.crypto)
    implementation(libs.koin.android)
    implementation(libs.koin.compose)
    implementation(libs.koin.core)
    implementation(libs.play.services.tagmanager.v4.impl)
    debugImplementation(libs.compose.ui.tooling)
}