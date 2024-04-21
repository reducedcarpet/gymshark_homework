package net.firestaff.mcp.gymsharkhomework.services

import android.content.res.Configuration
import androidx.compose.ui.unit.dp

fun calculateGridColumns(configuration: Configuration): Int {
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    if (screenWidth > screenHeight) {
        return 3
    }

    return when {
        screenWidth >= 800.dp -> 4
        screenWidth >= 600.dp -> 3
        else -> 2
    }
}