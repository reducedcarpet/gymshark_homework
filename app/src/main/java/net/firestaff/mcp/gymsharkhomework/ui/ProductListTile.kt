package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.CurrencyService
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer16
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer8

@Composable
fun ProductListTile(
    product: Product,
    onClick: () -> Unit
) {
    val context = LocalContext.current

    Column(
        modifier = Modifier.clickable(onClick = onClick),
    ) {
        Card(
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                disabledContainerColor = MaterialTheme.colorScheme.tertiary,
                disabledContentColor = MaterialTheme.colorScheme.onPrimary,
            )

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .height(260.dp)
                ) {
                    Box {
                        NetworkImage(product.featuredMedia)
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp),
                        ) {
                            Spacer(modifier = Modifier.weight(1f))
                            HeartIconButton(onClick = { /* Perform an action here */ })
                        }
                    }
                }
            }
        }
        Spacer8()
        Text(text = product.title, style = MaterialTheme.typography.bodyMedium)
        Spacer8()
        Text(
            text = product.colour,
            style = MaterialTheme.typography.bodySmall.copy(
                color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f)
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = CurrencyService.formatCurrency(context, product.price),
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
        )
        Spacer16()
    }
}
