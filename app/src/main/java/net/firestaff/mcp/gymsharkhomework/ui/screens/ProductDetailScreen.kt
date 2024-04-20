package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import kotlinx.coroutines.delay
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.transformImageUrl
import net.firestaff.mcp.gymsharkhomework.ui.NetworkImage
import net.firestaff.mcp.gymsharkhomework.ui.SimpleHtmlText
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import net.firestaff.mcp.gymsharkhomework.viewmodels.ProductViewModel

@Composable
fun ProductDetail(navController: NavController, productId: String, productViewModel: ProductViewModel) {
    var isLoading by remember { mutableStateOf(true) }
    var product by remember { mutableStateOf<Product?>(null) }

    LaunchedEffect(key1 = productId) {
        delay(400) // Simulate network delay

        product = productViewModel.getProduct(productId)

        isLoading = false
    }

    if (isLoading || product == null) {
        CircularProgressIndicator(modifier = Modifier.fillMaxSize().wrapContentSize())
    } else {
        product?.let {
            TopAppBarScaffold(
                title = it.type,
                navController = navController,
                content = {
                    ProductDetailContent(it)
                }
            )
        }
    }
}

@Composable
fun ProductDetailContent(
    product: Product
) {
    val scrollState = rememberScrollState()

    Card(
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp).verticalScroll(scrollState)) {
            Text(text = "Name: ${product.title}")
            Spacer(modifier = Modifier.height(8.dp))

            if (product.description.isNotEmpty()) {
                SimpleHtmlText("Description: ${product.description}")
                Spacer(modifier = Modifier.height(8.dp))
            }

            Text(text = "Price: ${product.price}")
            Spacer(modifier = Modifier.height(8.dp))

            if (product.featuredMedia.src.isNotEmpty()) {
                Text(text = "Image:")
                val painter = rememberImagePainter(
                    request = ImageRequest.Builder(LocalContext.current)
                        .data(transformImageUrl(product.featuredMedia.src))
                        .build()
                )

                Image(
                    painter = painter,
                    contentDescription = "Product Image for ${product.title}",
                    modifier = Modifier.fillMaxWidth()
                )

                NetworkImage(product.featuredMedia.src)
            }

            Text(text = "Post Image:")
        }
    }
}

@Composable
fun CircularProgressIndicator(modifier: Modifier) {
    Box(modifier = modifier) {
        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
    }
}