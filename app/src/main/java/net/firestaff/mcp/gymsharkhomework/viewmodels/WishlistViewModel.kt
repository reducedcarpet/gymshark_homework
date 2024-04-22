package net.firestaff.mcp.gymsharkhomework.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import net.firestaff.mcp.gymsharkhomework.infrastructure.wishlist.WishlistRepository
import javax.inject.Inject

@HiltViewModel
class WishlistViewModel @Inject constructor(
    private val repository: WishlistRepository
) : ViewModel() {

    // Just held in memory in the repository, no real backend.
    val wishlist: LiveData<Set<String>> = repository.wishlistItems

    fun addToWishlist(productId: String) {
        repository.addToWishlist(productId)
    }

    fun removeFromWishlist(productId: String) {
        repository.removeFromWishlist(productId)
    }
}