package net.firestaff.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
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
import kotlinx.coroutines.launch
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.calculateMediaHeight
import net.firestaff.mcp.gymsharkhomework.ui.NetworkImage
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer8

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProductDetailContent(
    product: Product
) {
    var mainImage by remember { mutableStateOf(product.featuredMedia) }
    val pagerState = rememberPagerState(
        pageCount = { product.media.size },
        initialPage = product.featuredMedia.position - 1,
    )

    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()

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
            )
            { page ->
                val media = product.media[page]
                NetworkImage(
                    media,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(media.height.dp)
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
            val index = image.position - 1 // product.media.indexOf(image)
            if (index != -1) {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(index)
                }
            }
        }

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