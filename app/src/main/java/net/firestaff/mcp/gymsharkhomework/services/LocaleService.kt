package net.firestaff.mcp.gymsharkhomework.services

import android.content.Context
import java.util.Locale

class LocaleService {
    companion object {
        fun getCurrentLocale(context: Context): Locale {
            return if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                context.resources.configuration.locales.get(0)
            } else {
                @Suppress("DEPRECATION")
                context.resources.configuration.locale
            }
        }
    }
}