package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.models.Media

@Composable
fun ThumbnailRow(images: List<Media>, onImageSelected: (Media) -> Unit) {
    var selectedMedia: Media? by remember { mutableStateOf<Media?>(null) }

    LazyRow(horizontalArrangement = Arrangement.Start, contentPadding = PaddingValues(4.dp)) {
        items(images.size) { index ->
            val media = images[index]
            ImageThumbnail(
                media,
                isSelected = media.id == selectedMedia?.id,
                onImageSelected = {
                    selectedMedia = it
                    onImageSelected(it)
                }
            )
        }
    }
}