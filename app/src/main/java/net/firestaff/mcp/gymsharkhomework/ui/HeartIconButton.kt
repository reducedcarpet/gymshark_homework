package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.ui.theme.black
import net.firestaff.mcp.gymsharkhomework.ui.theme.white

@Composable
fun HeartIconButton(onClick: () -> Unit, isFilled: Boolean = false) {
    IconButton(
        onClick = onClick,
        colors = IconButtonDefaults.iconButtonColors(
            contentColor = black,
            containerColor = white,
        ),
    ) {

        Icon(
            imageVector = if (isFilled) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
            contentDescription = "Favorite",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHeartIconButton() {
    HeartIconButton(onClick = { /* Perform an action here */ })
}