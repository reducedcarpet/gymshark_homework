package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.ui.theme.TextStyles
import net.firestaff.mcp.gymsharkhomework.ui.theme.black
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer32
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer4

@Composable
fun WheelPicker(
    items: List<String>,  // List of items to display
    onItemSelected: (String) -> Unit  // Callback when an item is selected
) {
    val listState = rememberLazyListState()

    Box(
        modifier = Modifier
            .width(40.dp)
            .height(140.dp),
    ) {
        LazyColumn(
            state = listState,
            verticalArrangement = Arrangement.Center
        ) {
            items(items.size) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),  // Height of each item
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = items[index],
                        style = TextStyles.bodyMedium
                    )
                }
            }
        }

        val topBottomFade = Brush.verticalGradient(
            0f to Color.White,
            0.4f to Color.Transparent,
            0.6f to Color.Transparent,
            1f to Color.White
        )
        Box(
            modifier = Modifier
                .fadingEdge(topBottomFade)
                .background(Color.White)
                .fillMaxWidth()
                .height(140.dp),
        )

        Column(
            modifier = Modifier
                .height(140.dp),
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Divider(modifier = Modifier.height(1.5.dp), color = black)
            Spacer32()
            Divider(modifier = Modifier.height(1.5.dp), color = black)
            Spacer4()
            Spacer(modifier = Modifier.weight(1f))
        }
    }

    LaunchedEffect(listState) {
        snapshotFlow { listState.firstVisibleItemIndex }
            .collect { index ->
                onItemSelected(items[index])
            }
    }
}

fun Modifier.fadingEdge(brush: Brush) = this
    .graphicsLayer(compositingStrategy = CompositingStrategy.Offscreen)
    .drawWithContent {
        drawContent()
        drawRect(brush = brush, blendMode = BlendMode.DstIn)
    }