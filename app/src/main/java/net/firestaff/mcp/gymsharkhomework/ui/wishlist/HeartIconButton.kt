package net.firestaff.mcp.gymsharkhomework.ui.wishlist

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.R
import net.firestaff.mcp.gymsharkhomework.ui.theme.black
import net.firestaff.mcp.gymsharkhomework.ui.theme.white

@Composable
fun HeartIconButton(
    onClick: () -> Unit,
    isFilled: Boolean = false,
    containerColor: Color = white,
    modifier: Modifier = Modifier,
) {
    val addToWishlist = stringResource(id = R.string.add_to_wishlist)

    IconButton(
        onClick = onClick,
        colors = IconButtonDefaults.iconButtonColors(
            contentColor = black,
            containerColor = containerColor,
        ),
        modifier = modifier.size(32.dp).semantics { contentDescription = addToWishlist },
    ) {
        Icon(
            imageVector = if (isFilled) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
            contentDescription = "Add to Wishlist",
            modifier = Modifier
                .padding(8.dp)
                .size(20.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHeartIconButton() {
    HeartIconButton(onClick = { })
}