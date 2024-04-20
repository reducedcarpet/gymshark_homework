package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.firestaff.mcp.gymsharkhomework.ui.screens.MainScreen
import net.firestaff.mcp.gymsharkhomework.ui.screens.ProductDetail
import net.firestaff.mcp.gymsharkhomework.viewmodels.ProductViewModel

@Composable
fun ProductNavigation(navController: NavHostController, productViewModel: ProductViewModel) {

    NavHost(navController = navController, startDestination = "mainScreen") {

        composable("mainScreen") { MainScreen(navController, productViewModel) }

        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetail(navController, productId, productViewModel)
        }
    }
}