package net.firestaff.mcp.gymsharkhomework.ui.product


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer8

@Composable
fun ProductDetailContent(
    product: Product
) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.verticalScroll(scrollState)) {
        ProductFeaturedImageColumn(product)

        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Spacer8()
            ProductInfoColumn(product = product)
            Spacer8()
            SizeDropdown(product.sizeInStock)
        }

        if (product.description.isNotEmpty()) {
            Divider(thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
            SimpleHtmlText(
                product.description,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
            Spacer8()
        }

        Spacer8()
    }
}