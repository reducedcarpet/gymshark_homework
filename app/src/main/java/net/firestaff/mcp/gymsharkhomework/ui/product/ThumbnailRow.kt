package net.firestaff.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.models.Media
import net.firestaff.mcp.gymsharkhomework.ui.product.ImageThumbnail

@Composable
fun ThumbnailRow(images: List<Media>, selectedMedia: Media, onImageSelected: (Media) -> Unit) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(images.size) { index ->
            val media = images[index]
            ImageThumbnail(
                media,
                isSelected = media.id == selectedMedia.id,
                onSelectedImage = {
                    onImageSelected(it)
                }
            )
        }
    }
}