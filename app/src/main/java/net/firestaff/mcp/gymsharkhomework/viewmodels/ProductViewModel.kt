package net.firestaff.mcp.gymsharkhomework.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.firestaff.mcp.gymsharkhomework.infrastructure.MockDataLoader
import net.firestaff.mcp.gymsharkhomework.infrastructure.ProductRepository
import net.firestaff.mcp.gymsharkhomework.models.Product
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val repository: ProductRepository
) : ViewModel() {
    val products: MutableLiveData<Map<String, Product>> = MutableLiveData<Map<String, Product>>()

    fun getProduct(id: String): Product? {
        return products.value?.get(id)
    }

    fun fetchProducts(context : Context) {
        viewModelScope.launch {
            val loadedProducts = repository.fetchProducts(context)
            loadedProducts.let {
                products.value = it
            }
        }
    }
}