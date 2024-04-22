package net.firestaff.mcp.gymsharkhomework.ui.wishlist

import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProductSnackbarHost (hostState: SnackbarHostState, modifier: Modifier) {
    SnackbarHost(
        hostState = hostState,
        snackbar = { snackbarData ->
            WishlistSnackbar(snackbarData = snackbarData)
        },
        modifier = modifier,
    )
}