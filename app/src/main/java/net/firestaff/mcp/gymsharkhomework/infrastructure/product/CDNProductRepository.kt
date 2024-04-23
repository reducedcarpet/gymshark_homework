package net.firestaff.mcp.gymsharkhomework.infrastructure.product

import android.content.Context
import com.google.gson.JsonParser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.firestaff.mcp.gymsharkhomework.data.CDN_URL
import net.firestaff.mcp.gymsharkhomework.infrastructure.DataLoader.Companion.parseProductList
import net.firestaff.mcp.gymsharkhomework.infrastructure.log.LogUtil.debug
import net.firestaff.mcp.gymsharkhomework.models.Product
import okhttp3.OkHttpClient
import okhttp3.Request
import javax.inject.Inject

class CDNProductRepository @Inject constructor() : ProductRepository {
    private val client = OkHttpClient()

    override suspend fun fetchProducts(context: Context): Map<String, Product> {
        val json = fetchJsonData() ?: "{}"
        val element = JsonParser.parseString(json)
        val hitsJson = element.asJsonObject.get("hits").toString()

        return parseProductList(hitsJson)
    }

    private suspend fun fetchJsonData(): String? = withContext(Dispatchers.IO) {
        try {
            val request = Request.Builder()
                .url(CDN_URL)
                .build()

            client.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    response.body?.string()
                } else {
                    debug(message = "HTTP error response: ${response.code}")
                    null
                }
            }
        } catch (e: Exception) {
            debug(message = "Error fetching data ${e.message}")
            null
        }
    }
}