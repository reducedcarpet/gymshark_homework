package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.size.Precision
import coil.size.Scale
import net.firestaff.mcp.gymsharkhomework.R

@Composable
fun NetworkImage(url: String) {
    val context = LocalContext.current
    val request = ImageRequest.Builder(context)
        .data(url)
        .allowConversionToBitmap(true)
        .crossfade(true)
        .scale(Scale.FILL)
        .precision(Precision.EXACT)
        .build()

    val painter = rememberImagePainter(request)

    println("URL: $url")

    AsyncImage(
        model = url,
        contentDescription = "Product Image",
        modifier = Modifier.fillMaxWidth()
    )
}