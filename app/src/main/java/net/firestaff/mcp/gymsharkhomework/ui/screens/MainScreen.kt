package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import net.firestaff.mcp.gymsharkhomework.models.Category
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import net.firestaff.mcp.gymsharkhomework.ui.lists.CategoryList

@Composable
fun MainScreen(
    navController: NavController,
    categories: List<Category>
) {
    TopAppBarScaffold(
        title = "Snack List",
        navController = navController,
        content = {
            MainScreenContent(navController, categories)
        }
    )
}

@Composable
fun MainScreenContent(
    navController: NavController,
    categories: List<Category>
) {
    CategoryList(
        categories,
        navController
    )
}