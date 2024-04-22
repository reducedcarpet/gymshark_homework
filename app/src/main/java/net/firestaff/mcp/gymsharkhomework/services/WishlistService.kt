package net.firestaff.mcp.gymsharkhomework.services

import android.content.Context
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import net.firestaff.mcp.gymsharkhomework.R
import net.firestaff.mcp.gymsharkhomework.viewmodels.WishlistViewModel

class WishlistService {
    companion object {
        fun handleWishlistAction(
            context: Context,
            productId: String,
            isCurrentlyWishlisted: Boolean,
            wishlistViewModel: WishlistViewModel,
            snackbarHostState: SnackbarHostState,
            scope: CoroutineScope
        ) {
            val removeMessage = context.getString(R.string.removed_from_wishlist)
            val addMessage = context.getString(R.string.added_to_wishlist)
            val dismissMessage = context.getString(R.string.dismiss)
            val undoMessage = context.getString(R.string.undo)

            if (isCurrentlyWishlisted) {
                wishlistViewModel.removeFromWishlist(productId)
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = removeMessage,
                        actionLabel = undoMessage,
                        duration = SnackbarDuration.Short
                    )
                }
            } else {
                wishlistViewModel.addToWishlist(productId)
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = addMessage,
                        actionLabel = dismissMessage,
                        duration = SnackbarDuration.Short
                    )
                }
            }
        }
    }
}