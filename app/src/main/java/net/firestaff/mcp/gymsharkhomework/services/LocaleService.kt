package net.firestaff.mcp.gymsharkhomework.services

import android.content.Context
import java.util.Locale

class LocaleService {
    companion object {
        fun getCurrentLocale(context: Context): Locale {
            return context.resources.configuration.locales.get(0)
        }
    }
}