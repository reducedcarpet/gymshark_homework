package net.firestaff.mcp.gymsharkhomework.infrastructure

import com.google.gson.GsonBuilder
import net.firestaff.mcp.gymsharkhomework.models.Size

class GsonService {
    companion object {
        val gson = GsonBuilder()
            .registerTypeAdapter(Size::class.java, SizeDeserializer())
            .create()
    }
}