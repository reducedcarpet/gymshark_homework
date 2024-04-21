package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage
import net.firestaff.mcp.gymsharkhomework.models.Media

@Composable
fun NetworkImage(media: Media, modifier: Modifier = Modifier) {
    AsyncImage(
        model = media.src, //rememberAsyncImagePainter(model = url),
        contentDescription = media.alt,
        modifier = modifier
    )
}