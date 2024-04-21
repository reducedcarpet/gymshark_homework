package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HeartIconButton(onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "Favorite",
            modifier = Modifier.padding(12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHeartIconButton() {
    HeartIconButton(onClick = { /* Perform an action here */ })
}