plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    id("app.cash.paparazzi")
}

android {
    namespace = "net.firestaff.mcp.gymsharkhomework"
    compileSdk = 34

    defaultConfig {
        applicationId = "net.firestaff.mcp.gymsharkhomework"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
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

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }

    packaging {
        resources {
            excludes += "META-INF/"
            excludes += "okhttp3/"
            excludes += "kotlin/"
            excludes += "org/"
            excludes += ".properties"
            excludes += ".bin"
        }
    }
}

dependencies {

    implementation(libs.androidx.navigation.compose)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.glide)
    implementation(libs.coil.compose)
    implementation(libs.compose.runtime)

    implementation("androidx.compose.runtime:runtime-livedata")
    implementation(platform("androidx.compose:compose-bom:2024.04.01"))
    implementation(libs.androidx.activity.compose)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose")
    implementation("androidx.compose.material:material-icons-extended")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation(libs.retrofit2.kotlin.coroutines.adapter)

    implementation("com.google.dagger:hilt-android")
    kapt(libs.dagger.hilt.compiler)
    kapt(libs.hilt.ext.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    implementation(libs.accompanist.pager.layouts)
    implementation(libs.accompanist.pager.indicators)

    implementation(libs.androidx.core.splashscreen)

    implementation(libs.coil.compose.v260)

    implementation(libs.timber)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.material3.android)


    testImplementation(libs.junit)
    testImplementation(libs.app.paparazzi)


    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.app.paparazzi)


    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}


// TODO Remove when https://github.com/google/guava/issues/6567 is fixed.
// See also: https://github.com/google/guava/issues/6801.
dependencies.constraints {
    testImplementation("com.google.guava:guava") {
        attributes {
            attribute(
                TargetJvmEnvironment.TARGET_JVM_ENVIRONMENT_ATTRIBUTE,
                objects.named(TargetJvmEnvironment::class.java, TargetJvmEnvironment.STANDARD_JVM)
            )
        }
        because("Paparazzi's layoutlib and sdk-common depend on Guava's -jre published variant." +
                "See https://github.com/cashapp/paparazzi/issues/906.")
    }
}

kapt {
    correctErrorTypes = true
}