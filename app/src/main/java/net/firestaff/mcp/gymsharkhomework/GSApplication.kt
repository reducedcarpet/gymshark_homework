package net.firestaff.mcp.gymsharkhomework

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import net.firestaff.mcp.gymsharkhomework.infrastructure.log.CrashReportingTree
import timber.log.Timber

@HiltAndroidApp
class GSApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            // For release mode to integrate with crash reporting
            Timber.plant(CrashReportingTree())
        }
    }
}