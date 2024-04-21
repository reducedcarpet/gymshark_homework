package net.firestaff.mcp.gymsharkhomework.infrastructure

import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.models.ProductResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    suspend fun fetchProducts(): Response<ProductResponse>
}