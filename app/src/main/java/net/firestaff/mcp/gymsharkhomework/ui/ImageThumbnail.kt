package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.data.defaultAspectRatio
import net.firestaff.mcp.gymsharkhomework.data.thumbnailHeight
import net.firestaff.mcp.gymsharkhomework.models.Media

@Composable
fun ImageThumbnail(
    media: Media,
    isSelected: Boolean,
    onImageSelected: (Media) -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clickable { onImageSelected(media) }
            .padding(2.dp)
    ) {
        NetworkImage(
            media,
            modifier = Modifier
                .height(thumbnailHeight.dp)
                .width((thumbnailHeight / defaultAspectRatio).dp)
                .then(
                    if (isSelected) Modifier.border(2.dp, Color.Black)
                    else Modifier
                ),
        )
    }
}