package net.firestaff.mcp.gymsharkhomework.utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import net.firestaff.mcp.gymsharkhomework.ui.theme.LightColorScheme
import net.firestaff.mcp.gymsharkhomework.ui.theme.latoTypography

@Composable
fun TestTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = latoTypography,
        content = content
    )
}