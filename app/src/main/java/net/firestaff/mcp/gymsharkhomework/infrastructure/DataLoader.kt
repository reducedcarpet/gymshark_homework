package net.firestaff.mcp.gymsharkhomework.infrastructure

import android.content.Context
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import net.firestaff.mcp.gymsharkhomework.infrastructure.log.LogUtil.debug
import net.firestaff.mcp.gymsharkhomework.models.Product
import java.io.IOException

class DataLoader {
    companion object {
        fun loadJSONFromAsset(context: Context, fileName: String = "data.json"): String? {
            return try {
                val file = context.assets.open(fileName)
                file.use { inputStream ->
                    val size = inputStream.available()
                    val buffer = ByteArray(size)
                    inputStream.read(buffer)
                    String(buffer, Charsets.UTF_8)
                }
            } catch (e: IOException) {
                debug(message = "Error fetching data ${e.message}")
                debug(message = "Trace: ${e.stackTraceToString()}")
                null
            }
        }

        fun parseProductList(jsonString: String): Map<String, Product> {
            val gson = GsonService.gson

            val productListType = object : TypeToken<List<Product>>() {}.type
            val products = gson.fromJson<List<Product>>(jsonString, productListType)

            return products.associateBy { it.id }
        }
    }
}