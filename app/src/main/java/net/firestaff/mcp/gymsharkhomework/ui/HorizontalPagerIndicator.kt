package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.pager.PagerState
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalConfiguration
import net.firestaff.mcp.gymsharkhomework.ui.theme.darkGrey

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    activeColor: Color = darkGrey,
    inactiveColor: Color = Color.Transparent,
    indicatorHeight: Dp = 5.dp,
    spacing: Dp = 2.dp
) {
    val configuration = LocalConfiguration.current
    val screenWidthDp =
        configuration.screenWidthDp.dp - (spacing * (pagerState.pageCount - 1)) - 16.dp
    val indicatorWidth = screenWidthDp / pagerState.pageCount

    Row(modifier = modifier) {
        Canvas(modifier = modifier) {
            val widthPx = indicatorWidth.toPx()
            val heightPx = indicatorHeight.toPx()
            val spaceWidth = spacing.toPx()

            val startOffset = 0

            for (i in 0 until pagerState.pageCount) {
                val color = if (i == pagerState.currentPage) activeColor else inactiveColor
                drawRoundRect(
                    color = color,
                    topLeft = Offset(x = startOffset + i * (widthPx + spaceWidth), y = 0f),
                    size = androidx.compose.ui.geometry.Size(widthPx, heightPx),
                    cornerRadius = CornerRadius(
                        x = heightPx / 2,
                        y = heightPx / 2
                    )
                )
            }
        }
    }
}