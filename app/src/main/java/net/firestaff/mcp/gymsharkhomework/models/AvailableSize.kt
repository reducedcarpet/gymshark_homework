package net.firestaff.mcp.gymsharkhomework.models

data class AvailableSize (
    val id: String,
    val inStock: Boolean,
    val inventoryQuantity: Int,
    val price: Int,
    val size: String,
    val sku: String
) {
    fun isAvailable(): Boolean {
        return inStock && inventoryQuantity > 0
    }
}