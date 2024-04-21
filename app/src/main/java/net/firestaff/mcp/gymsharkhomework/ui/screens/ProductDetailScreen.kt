package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.calculateMediaHeight
import net.firestaff.mcp.gymsharkhomework.ui.HorizontalPagerIndicator
import net.firestaff.mcp.gymsharkhomework.ui.NetworkImage
import net.firestaff.mcp.gymsharkhomework.ui.SimpleHtmlText
import net.firestaff.mcp.gymsharkhomework.ui.ThumbnailRow
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import net.firestaff.mcp.gymsharkhomework.ui.utils.spacer4
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
        product = productViewModel.getProduct(productId)
        isLoading = false
    }

    if (isLoading || product == null) {
        CircularProgressIndicator(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize())
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProductDetailContent(
    product: Product
) {
    var mainImage by remember { mutableStateOf(product.featuredMedia) }
    val scrollState = rememberScrollState()
    val pagerState = rememberPagerState(pageCount = { product.media.size })
    val coroutineScope = rememberCoroutineScope()  // Create a coroutine scope


    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp.dp
    val imageHeight = calculateMediaHeight(screenWidthDp)

    LaunchedEffect(pagerState.currentPage) {
        mainImage = product.media[pagerState.currentPage]
    }

    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Box(modifier = Modifier) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(imageHeight.dp)
            ) { page ->
                val media = product.media[page]
                NetworkImage(
                    media,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(imageHeight.dp)
                )
            }
            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp),
            )
        }

        ThumbnailRow(product.media, mainImage) { image ->
            val index = product.media.indexOf(image)
            if (index != -1) {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(index)
                }
            }
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
