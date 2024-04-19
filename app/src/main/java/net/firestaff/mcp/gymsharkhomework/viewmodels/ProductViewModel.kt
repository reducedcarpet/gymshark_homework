package net.firestaff.mcp.gymsharkhomework.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.firestaff.mcp.gymsharkhomework.infrastructure.MockDataLoader
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductViewModel : ViewModel() {
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products

    // TODO - move to infrastructure
    fun fetchCategories(context : Context) {
        val products = MockDataLoader().loadMockData(context)

        _products.postValue(products)
    }

    fun fetchCategoriesFromApi() {
        RetrofitClient.retrofitInstance.fetchProducts()
            .enqueue(
                object : Callback<List<Product>> {
                    override fun onResponse(
                        call: Call<List<Product>>,
                        response: Response<List<Product>>
                    ) {
                        if (response.isSuccessful) {
                            _products.postValue(response.body())
                        } else {
                            // Handle error
                            println("Error: ${response.errorBody()}")
                        }
                    }

                    override fun onFailure(call: Call<List<Product>>, t: Throwable) {
                        // Handle failure
                        println("Failure: ${t.message}")
                    }
                }
            )
    }
}