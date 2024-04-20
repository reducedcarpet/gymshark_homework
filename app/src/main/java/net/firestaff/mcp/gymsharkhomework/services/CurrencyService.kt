package net.firestaff.mcp.gymsharkhomework.services

import android.content.Context
import java.text.NumberFormat
import java.util.Locale

class CurrencyService {
    companion object {
        fun formatCurrency(context: Context, value: Double): String {
            val locale = LocaleService.getCurrentLocale(context)
            val formatter = NumberFormat.getCurrencyInstance(locale)
            return formatter.format(value)
        }
    }
}