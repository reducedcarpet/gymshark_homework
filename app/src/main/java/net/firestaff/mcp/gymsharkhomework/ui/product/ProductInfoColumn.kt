package net.firestaff.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.CurrencyService
import net.firestaff.mcp.gymsharkhomework.ui.theme.TextStyles
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer8
import net.firestaff.mcp.gymsharkhomework.utils.kebabToTitleCase

@Composable
fun ProductInfoColumn(product: Product) {
    val context = LocalContext.current

    Column {
        Text(text = product.title, style = TextStyles.bodyMedium)
        Spacer8()
        if (!product.labels.isNullOrEmpty()) {
            Text(
                text = product.labels.joinToString(", ") { it.kebabToTitleCase() },
                style = TextStyles.bodySmallOnPrimary,
            )
            Spacer8()
        }
        Text(
            text = product.colour,
            style = TextStyles.bodySmallOnPrimary,
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = CurrencyService.formatCurrency(context, product.price),
            style = TextStyles.bodyMediumBold,
        )
    }
}