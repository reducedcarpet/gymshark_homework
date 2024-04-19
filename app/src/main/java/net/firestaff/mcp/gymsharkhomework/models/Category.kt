package net.firestaff.mcp.gymsharkhomework.models

data class Category(
    val id: String,
    val name: String,
    val description: String,
    val products: List<Product>
)