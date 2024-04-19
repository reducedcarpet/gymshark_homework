package net.firestaff.mcp.gymsharkhomework.infrastructure

import android.content.Context
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import net.firestaff.mcp.gymsharkhomework.models.Product
import java.io.FileReader
import java.io.IOException

class MockDataLoader {
    fun loadMockData(context: Context): List<Product> {
        val jsonFilePath = "data.json"
        val jsonString = loadJSONFromAsset(context, fileName = jsonFilePath)

        val element = JsonParser().parse(jsonString)
        val hitsJson = element.asJsonObject.get("hits").toString()

        println("*** hitsJson: $hitsJson ***")

        return parseProductList(hitsJson)
    }

    private fun readJsonFile(filePath: String): String {
        return FileReader(filePath).use { it.readText() }
    }

    private fun loadJSONFromAsset(context: Context, fileName: String = "data.json"): String? {
        return try {
            val file = context.assets.open(fileName)
            file.use { inputStream ->
                val size = inputStream.available()
                val buffer = ByteArray(size)
                inputStream.read(buffer)
                String(buffer, Charsets.UTF_8)
            }
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun parseProduct(jsonString: String): Product {
        val gson = Gson()
        return gson.fromJson(jsonString, Product::class.java)
    }

    private fun parseProductList(jsonString: String): List<Product> {
        val gson = Gson()
        val productListType = object : TypeToken<List<Product>>() {}.type
        return gson.fromJson(jsonString, productListType)
    }
}