package net.firestaff.mcp.gymsharkhomework.infrastructure.wishlist

import androidx.lifecycle.LiveData

interface WishlistRepository  {
    val wishlistItems: LiveData<Set<String>>

    fun addToWishlist(productId: String)

    fun removeFromWishlist(productId: String)
}