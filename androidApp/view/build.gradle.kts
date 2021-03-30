plugins {
    id("com.itdevexpert.mobius.android-library")
}

android {

    defaultConfig {
        versionCode = 1
        versionName = "0.0"
    }

    kotlinOptions {
        jvmTarget = V.JVM.Kotlin.target
        useIR = true
    }

    buildFeatures {
//        Enables Jetpack Compose for this module
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = V.AndroidX.jetpackCompose
    }

}
dependencies {
    api(D.Google.material)

    api(D.AndroidX.JetpackCompose.runtime)
    api(D.AndroidX.JetpackCompose.ui)
    api(D.AndroidX.JetpackCompose.uiTooling)
    api(D.AndroidX.JetpackCompose.foundation)
    api(D.AndroidX.JetpackCompose.material)
    api(D.AndroidX.JetpackCompose.materialIconsCore)
    api(D.AndroidX.JetpackCompose.materialIconsExtended)
    api(D.AndroidX.JetpackCompose.activityCompose)
    api(D.AndroidX.JetpackCompose.lifecycleViewModelCompose)
    api(D.AndroidX.JetpackCompose.runtimeLivedata)
    api(D.AndroidX.JetpackCompose.runtimeRxJava2)

//    Testing
    androidTestImplementation(D.AndroidX.JetpackCompose.AndroidTest.uiTestJunit4)
}