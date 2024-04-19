package net.firestaff.mcp.gymsharkhomework.services

import net.firestaff.mcp.gymsharkhomework.models.Category
import net.firestaff.mcp.gymsharkhomework.models.Product
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/")
    fun fetchProducts(): Call<List<Product>>
}