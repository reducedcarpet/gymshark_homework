package net.firestaff.mcp.gymsharkhomework.infrastructure

import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonParseException
import net.firestaff.mcp.gymsharkhomework.models.Size
import java.lang.reflect.Type

class SizeDeserializer : JsonDeserializer<Size> {
    override fun deserialize(
        json: JsonElement, typeOfT: Type?,
        context: JsonDeserializationContext?
    ): Size {
        val sizeStr = json.asString
        return Size.from(sizeStr) ?: throw JsonParseException("Unexpected size value: $sizeStr")
    }
}