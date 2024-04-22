package net.firestaff.mcp.gymsharkhomework.infrastructure.product

import android.content.Context
import net.firestaff.mcp.gymsharkhomework.models.Product
import retrofit2.http.GET

interface ProductRepository {
    @GET("products")
    suspend fun fetchProducts(context: Context): Map<String, Product>
}