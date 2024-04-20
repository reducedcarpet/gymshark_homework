package net.firestaff.mcp.gymsharkhomework.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import net.firestaff.mcp.gymsharkhomework.infrastructure.MockDataLoader
import net.firestaff.mcp.gymsharkhomework.models.Product

@HiltViewModel
class ProductViewModel : ViewModel() {
    val products: MutableLiveData<Map<String, Product>> = MutableLiveData<Map<String, Product>>()

    fun getProduct(id: String): Product? {
        return products.value?.get(id)
    }

    // TODO - move to infrastructure
    fun fetchProducts(context : Context) {
        val loadedProducts = MockDataLoader().loadMockData(context)

        products.value = loadedProducts
    }

    //fun fetchCategoriesFromApi() {
    //    RetrofitClient.retrofitInstance.fetchProducts()
    //        .enqueue(
    //            object : Callback<List<Product>> {
    //                override fun onResponse(
    //                    call: Call<List<Product>>,
    //                    response: Response<List<Product>>
    //                ) {
    //                    if (response.isSuccessful) {
    //                        products.postValue(response.body())
    //                    } else {
    //                        // Handle error
    //                        println("Error: ${response.errorBody()}")
    //                    }
    //                }

    //                override fun onFailure(call: Call<List<Product>>, t: Throwable) {
    //                    // Handle failure
    //                    println("Failure: ${t.message}")
    //                }
    //            }
    //        )
    //}
}