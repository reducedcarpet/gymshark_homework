package net.firestaff.mcp.gymsharkhomework.services

import net.firestaff.mcp.gymsharkhomework.data.API_BASE_URL

fun transformImageUrl(url: String): String {
    return API_BASE_URL + url
}