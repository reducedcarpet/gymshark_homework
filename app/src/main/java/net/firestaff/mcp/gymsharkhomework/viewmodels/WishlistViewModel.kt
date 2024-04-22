package net.firestaff.mcp.gymsharkhomework.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WishlistViewModel @Inject constructor() : ViewModel() {
    // Add wishlist repository here... going into some user linked backend shenanigan...
    // Just held in memory here.
    private val _wishlist = MutableLiveData<Set<String>>()
    val wishlist: LiveData<Set<String>> = _wishlist

    fun addToWishlist(productId: String) {
        val currentSet = _wishlist.value ?: emptySet()
        _wishlist.value = currentSet + productId
    }

    fun removeFromWishlist(productId: String) {
        val currentSet = _wishlist.value ?: emptySet()
        _wishlist.value = currentSet - productId
    }
}