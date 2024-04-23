package net.firestaff.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.background
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.data.gridImageHeight
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.NetworkImage
import net.firestaff.mcp.gymsharkhomework.ui.theme.grey
import net.firestaff.mcp.gymsharkhomework.ui.wishlist.HeartIconButton

@Composable
fun ProductImage(
    product: Product,
    isWishlisted: Boolean = false,
    onWishlist: (String) -> Unit,
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
                    .height(gridImageHeight.dp)
            ) {
                Box {
                    Box {
                        Box(
                            modifier = Modifier
                                .matchParentSize()  // Ensure it matches the size of the parent Box
                                .background(grey)  // Set the background color to grey
                        )

                        NetworkImage(product.featuredMedia)
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        HeartIconButton(
                            onClick = { onWishlist(product.id) },
                            isFilled = isWishlisted,
                        )
                    }
                }
            }
        }
    }
}