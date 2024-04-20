package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import kotlinx.coroutines.delay
import net.firestaff.mcp.gymsharkhomework.data.defaultAspectRatio
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.transformImageUrl
import net.firestaff.mcp.gymsharkhomework.ui.NetworkImage
import net.firestaff.mcp.gymsharkhomework.ui.SimpleHtmlText
import net.firestaff.mcp.gymsharkhomework.ui.ThumbnailRow
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import net.firestaff.mcp.gymsharkhomework.ui.utils.spacer2
import net.firestaff.mcp.gymsharkhomework.ui.utils.spacer8
import net.firestaff.mcp.gymsharkhomework.viewmodels.ProductViewModel

@Composable
fun ProductDetail(
    navController: NavController,
    productId: String,
    productViewModel: ProductViewModel
) {
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
    var mainImage by remember { mutableStateOf(product.featuredMedia) }
    val scrollState = rememberScrollState()

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val imageHeight = screenWidth / defaultAspectRatio

    Column(modifier = Modifier.verticalScroll(scrollState)) {
        NetworkImage(mainImage, modifier = Modifier.fillMaxWidth().requiredHeight(imageHeight.dp))
        spacer2()
        ThumbnailRow(product.media) { image ->
            mainImage = image
        }

        Text(text = product.title)
        spacer8()
        Text(text = product.colour)
        spacer8()

        if (product.description.isNotEmpty()) {
            SimpleHtmlText("Description: ${product.description}")
            spacer8()
        }

        Text(text = "Price: ${product.price}")
        spacer8()

    }

}
