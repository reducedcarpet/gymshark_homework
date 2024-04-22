package net.firestaff.mcp.gymsharkhomework.services

import androidx.compose.ui.unit.Dp
import net.firestaff.mcp.gymsharkhomework.data.defaultAspectRatio

fun calculateMediaHeight(screenWidthDp: Dp) : Int {
    val imageHeight = screenWidthDp.value * defaultAspectRatio
    return imageHeight.toInt()
}
