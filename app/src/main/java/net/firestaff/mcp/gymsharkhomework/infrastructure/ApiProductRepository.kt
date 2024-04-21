package net.firestaff.mcp.gymsharkhomework.infrastructure

import android.content.Context
import com.google.gson.JsonParser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.firestaff.mcp.gymsharkhomework.data.API_BASE_URL
import net.firestaff.mcp.gymsharkhomework.infrastructure.MockDataLoader.Companion.parseProductList
import net.firestaff.mcp.gymsharkhomework.infrastructure.log.LogUtil
import net.firestaff.mcp.gymsharkhomework.infrastructure.log.LogUtil.debug
import net.firestaff.mcp.gymsharkhomework.models.Product
import java.io.BufferedReader
import java.net.URL
import javax.inject.Inject
import javax.net.ssl.HttpsURLConnection

class ApiProductRepository @Inject constructor() : ProductRepository {

    override suspend fun fetchProducts(context: Context): Map<String, Product> {
        val json = fetchJsonData() ?: "{}"
        val element = JsonParser().parse(json)
        val hitsJson = element.asJsonObject.get("hits").toString()

        return parseProductList(hitsJson)
    }

    suspend fun fetchJsonData(): String? = withContext(Dispatchers.IO) {
        var connection: HttpsURLConnection? = null
        try {
            connection = (URL(API_BASE_URL).openConnection() as? HttpsURLConnection)?.apply {
                requestMethod = "GET"
                connectTimeout = 15000
                readTimeout = 15000
                connect()
            }

            val responseCode = connection?.responseCode ?: -1
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                connection?.inputStream?.bufferedReader()?.use(BufferedReader::readText)
            } else {
                debug("HTTP error response: $responseCode")
                null
            }
        } catch (e: Exception) {
            debug("Error fetching data ${e.message}")
            debug("Trace: ${e.stackTraceToString()}")
            null
        } finally {
            connection?.disconnect()
        }
    }
}