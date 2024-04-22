package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import net.firestaff.mcp.gymsharkhomework.ui.product.ProductDetailContent
import net.firestaff.mcp.gymsharkhomework.viewmodels.ProductViewModel

@Composable
fun ProductDetailScreen(
    navController: NavController,
    productId: String,
    productViewModel: ProductViewModel,
) {

    var isLoading by remember { mutableStateOf(true) }
    var product by remember { mutableStateOf<Product?>(null) }

    LaunchedEffect(key1 = productId) {
        product = productViewModel.getProduct(productId)
        isLoading = false
    }

    if (isLoading || product == null) {
        CircularProgressIndicator(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize()
        )
    } else {
        product?.let {
            TopAppBarScaffold(
                title = it.type.uppercase(),
                navController = navController,
                content = {
                    ProductDetailContent(it)
                }
            )
        }
    }
}
