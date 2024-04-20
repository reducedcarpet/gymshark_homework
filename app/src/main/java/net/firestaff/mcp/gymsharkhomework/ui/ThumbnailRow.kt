package net.firestaff.mcp.gymsharkhomework.ui

import android.media.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.models.Media

@Composable
fun ThumbnailRow(images: List<Media>, onImageSelected: (Media) -> Unit) {
    LazyRow(horizontalArrangement = Arrangement.Start) {
        items(images.size) { index ->
            val media = images[index]
            NetworkImage(
                media,
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
                    .clickable { onImageSelected(media) },
            )
        }
    }
}