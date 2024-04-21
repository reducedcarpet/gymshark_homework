package net.firestaff.mcp.gymsharkhomework.infrastructure

import android.content.Context
import net.firestaff.mcp.gymsharkhomework.models.Product

class MockProductRepository : ProductRepository {
    override suspend fun fetchProducts(context: Context): Map<String, Product> {
        return MockDataLoader().loadMockData(context)
    }
}