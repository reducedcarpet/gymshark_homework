package net.firestaff.mcp.gymsharkhomework.ui.lists

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import net.firestaff.mcp.gymsharkhomework.models.Product

@Composable
fun CategoryList(items: List<Product>, navController: NavController) {

    LazyColumn {
        items(items) { item ->
            ProductList(items, navController)
        }
    }
}
