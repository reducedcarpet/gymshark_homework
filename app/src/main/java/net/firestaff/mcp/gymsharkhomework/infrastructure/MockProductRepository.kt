package net.firestaff.mcp.gymsharkhomework.infrastructure

import android.content.Context
import com.google.gson.JsonParser
import net.firestaff.mcp.gymsharkhomework.models.Product

class MockProductRepository : ProductRepository {
    override suspend fun fetchProducts(context: Context): Map<String, Product> {
        return loadMockData(context)
    }

    private fun loadMockData(context: Context): Map<String, Product> {
        val jsonFilePath = "data.json"
        val jsonString = DataLoader.loadJSONFromAsset(context, fileName = jsonFilePath)

        val element = JsonParser().parse(jsonString)
        val hitsJson = element.asJsonObject.get("hits").toString()

        return DataLoader.parseProductList(hitsJson)
    }
}