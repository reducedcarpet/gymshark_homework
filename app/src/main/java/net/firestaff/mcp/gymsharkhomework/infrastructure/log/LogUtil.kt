package net.firestaff.mcp.gymsharkhomework.infrastructure.log

import timber.log.Timber

object LogUtil {
    fun debug(message: String) {
        Timber.d(message)
    }

    fun error(message: String, throwable: Throwable? = null) {
        Timber.e(throwable, message)
    }

}