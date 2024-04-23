package net.firestaff.mcp.gymsharkhomework.infrastructure.product

import android.content.Context
import net.firestaff.mcp.gymsharkhomework.models.Product

interface ProductRepository {

    suspend fun fetchProducts(context: Context): Map<String, Product>
}