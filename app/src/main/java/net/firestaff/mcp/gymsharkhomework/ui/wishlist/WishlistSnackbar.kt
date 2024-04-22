package net.firestaff.mcp.gymsharkhomework.ui.wishlist

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.runtime.Composable

@Composable
fun WishlistSnackbar(snackbarData: SnackbarData) {
    Snackbar(
        snackbarData = snackbarData,
        actionColor = MaterialTheme.colorScheme.tertiary,
    )
}