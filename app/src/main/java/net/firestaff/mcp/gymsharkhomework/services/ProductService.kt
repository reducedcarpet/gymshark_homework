package net.firestaff.mcp.gymsharkhomework.services

import net.firestaff.mcp.gymsharkhomework.models.Product

class ProductService {
    companion object {
        fun getProductById(id: String, products: List<Product>?): Product? {
            return products?.find { it.id == id }
        }
    }
}