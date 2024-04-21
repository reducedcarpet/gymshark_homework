package net.firestaff.mcp.gymsharkhomework.infrastructure

import net.firestaff.mcp.gymsharkhomework.models.ProductResponse
import retrofit2.Response

interface ApiService {
    suspend fun fetchProducts(): Response<ProductResponse>
}