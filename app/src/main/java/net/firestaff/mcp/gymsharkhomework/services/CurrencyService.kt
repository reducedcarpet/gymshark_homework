package net.firestaff.mcp.gymsharkhomework.services

import android.content.Context
import java.text.NumberFormat
import java.util.Locale

class CurrencyService {
    companion object {
        fun formatCurrency(
            context: Context,
            value: Double,
            locale: Locale = LocaleService.getCurrentLocale(context)
        ): String {
            val formatter = NumberFormat.getCurrencyInstance(locale)
            return formatter.format(value)
        }
    }
}
