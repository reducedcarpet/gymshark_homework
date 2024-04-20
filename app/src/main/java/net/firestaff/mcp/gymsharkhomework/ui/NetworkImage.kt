package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.size.Precision
import coil.size.Scale
import net.firestaff.mcp.gymsharkhomework.R
import net.firestaff.mcp.gymsharkhomework.models.Media

@Composable
fun NetworkImage(media: Media, modifier: Modifier = Modifier) {
    AsyncImage(
        model = media.src, //rememberAsyncImagePainter(model = url),
        contentDescription = media.alt,
        modifier = modifier
    )
}