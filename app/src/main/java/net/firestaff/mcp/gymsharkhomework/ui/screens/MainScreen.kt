package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import net.firestaff.mcp.gymsharkhomework.ui.lists.CategoryList
import net.firestaff.mcp.gymsharkhomework.ui.lists.ProductList

@Composable
fun MainScreen(
    navController: NavController,
    products: List<Product>
) {
    TopAppBarScaffold(
        title = "Snack List",
        navController = navController,
        content = {
            MainScreenContent(navController, products)
        }
    )
}

@Composable
fun MainScreenContent(
    navController: NavController,
    products: List<Product>
) {
    ProductList(
        products,
        navController
    )
}