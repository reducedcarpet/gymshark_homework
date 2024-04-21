package net.firestaff.mcp.gymsharkhomework.infrastructure.log

import android.util.Log
import timber.log.Timber

class CrashReportingTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.ERROR || priority == Log.WARN) {
            // Send non-fatal errors to crash reporting tool
            // e.g., FirebaseCrashlytics.getInstance().log(message)
        }
    }
}