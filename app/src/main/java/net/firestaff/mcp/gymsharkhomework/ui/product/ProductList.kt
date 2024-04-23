package net.firestaff.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.WishlistService
import net.firestaff.mcp.gymsharkhomework.services.calculateGridColumns
import net.firestaff.mcp.gymsharkhomework.ui.wishlist.ProductSnackbarHost
import net.firestaff.mcp.gymsharkhomework.viewmodels.WishlistViewModel

@Composable
fun ProductList(
    products: Map<String, Product>,
    navController: NavController,
    wishlistViewModel: WishlistViewModel,
) {
    val configuration = LocalConfiguration.current
    val gridColumns = calculateGridColumns(configuration)

    val wishlist = wishlistViewModel.wishlist.observeAsState(setOf()).value

    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(2.dp)) {
            //
            LazyVerticalGrid(
                columns = GridCells.Fixed(gridColumns),
                contentPadding = PaddingValues(4.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(
                    products.size,
                    key = { index -> products.values.elementAt(index).id }
                ) { index ->
                    val product = products.values.elementAt(index)
                    val isWishlisted = wishlist.contains(product.id)
                    val context = LocalContext.current

                    ProductListTile(
                        product = product,
                        isWishlisted = isWishlisted,
                        onWishlist = { productId ->
                            WishlistService.handleWishlistAction(
                                context,
                                productId,
                                wishlist.contains(productId),
                                wishlistViewModel,
                                snackbarHostState,
                                scope,
                            )
                        },
                        onClick = {
                            navController.navigate(
                                "productDetail/${product.id}"
                            )
                        },
                    )
                }
            }
        }
        ProductSnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier.align(alignment = Alignment.BottomCenter)
        )
    }
}
