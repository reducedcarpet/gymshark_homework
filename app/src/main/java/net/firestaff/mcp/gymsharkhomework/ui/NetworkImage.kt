package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import net.firestaff.mcp.gymsharkhomework.models.Media

@Composable
fun NetworkImage(media: Media, modifier: Modifier = Modifier) {
    AsyncImage(
        model = media.src,
        contentDescription = media.alt,
        modifier = modifier,
        contentScale = ContentScale.FillHeight
    )
}