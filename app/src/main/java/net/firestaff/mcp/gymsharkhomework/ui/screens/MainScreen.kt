package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import net.firestaff.mcp.gymsharkhomework.R
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import net.firestaff.mcp.gymsharkhomework.ui.lists.ProductList
import net.firestaff.mcp.gymsharkhomework.viewmodels.ProductViewModel

@Composable
fun MainScreen(
    navController: NavController,
    productViewModel: ProductViewModel,
) {

    if(productViewModel.products.value == null) {
        productViewModel.fetchProducts(navController.context)
    }

    val products = productViewModel.products.observeAsState(initial = mapOf()).value

    TopAppBarScaffold(
        title = stringResource(id = R.string.search_results),
        navController = navController,
        content = {
            MainScreenContent(navController, products)
        }
    )
}

@Composable
fun MainScreenContent(
    navController: NavController,
    products: Map<String, Product>
) {
    ProductList(
        products,
        navController
    )
}