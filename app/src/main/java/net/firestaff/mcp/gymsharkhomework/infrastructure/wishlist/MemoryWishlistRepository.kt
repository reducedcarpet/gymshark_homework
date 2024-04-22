package net.firestaff.mcp.gymsharkhomework.infrastructure.wishlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MemoryWishlistRepository @Inject constructor() : WishlistRepository {
    private val _wishlistItems = MutableLiveData<Set<String>>(setOf())
    override val wishlistItems: LiveData<Set<String>> = _wishlistItems

    override fun addToWishlist(productId: String) {
        val currentSet = _wishlistItems.value ?: emptySet()
        _wishlistItems.value = currentSet + productId
    }

    override fun removeFromWishlist(productId: String) {
        val currentSet = _wishlistItems.value ?: emptySet()
        _wishlistItems.value = currentSet - productId
    }
}