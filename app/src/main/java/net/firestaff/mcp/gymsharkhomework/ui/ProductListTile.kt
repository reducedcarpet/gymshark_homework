package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer16
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer8

@Composable
fun ProductListTile(
    product: Product,
    isWishlisted: Boolean = false,
    onClick: () -> Unit,
    onWishlist: (String) -> Unit,
) {
    Column(
        modifier = Modifier.clickable(onClick = onClick),
    ) {
        ProductImage(
            product = product,
            onClick = onClick,
            isWishlisted = isWishlisted,
            onWishlist = onWishlist,
        )
        Spacer8()
        ProductInfoColumn(product = product)
        Spacer16()
    }
}
