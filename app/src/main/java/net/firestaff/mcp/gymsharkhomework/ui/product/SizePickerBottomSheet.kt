package net.firestaff.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.data.sizePickerImageHeight
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.NetworkImage
import net.firestaff.mcp.gymsharkhomework.ui.PullTab
import net.firestaff.mcp.gymsharkhomework.ui.theme.grey
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer16
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer8
import net.firestaff.mcp.gymsharkhomework.ui.wishlist.HeartIconButton

@Composable
fun SizePickerBottomSheet(product: Product) {
    Column(modifier = Modifier.fillMaxWidth()) {
        PullTab()
        Spacer8()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(modifier = Modifier.height(sizePickerImageHeight.dp)) {
                NetworkImage(
                    product.featuredMedia,
                    modifier = Modifier.clip(shape = RoundedCornerShape(4.dp)),
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box(modifier = Modifier.weight(1f).height(sizePickerImageHeight.dp)) {
                Column {
                    Spacer(modifier = Modifier.weight(1f))
                    ProductInfoColumn(product = product)
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            HeartIconButton(
                onClick = { },
                isFilled = false,
                containerColor = grey.copy(alpha = 0.3f),
            )
        }
        Spacer16()
    }
}