package net.firestaff.mcp.gymsharkhomework.ui.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.calculateGridColumns
import net.firestaff.mcp.gymsharkhomework.ui.ProductListTile

@Composable
fun ProductList(products: Map<String, Product>, navController: NavController) {

    val configuration = LocalConfiguration.current
    val gridColumns = calculateGridColumns(configuration)

    Column(modifier = Modifier.padding(2.dp)) {
        //
        LazyVerticalGrid(
            columns = GridCells.Fixed(gridColumns),
            contentPadding = PaddingValues(4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(products.size) { index ->
                val product = products.values.elementAt(index)

                ProductListTile(
                    product = product,
                    onClick = {
                        navController.navigate(
                            "productDetail/${product.id}"
                        )
                    },
                )
            }
        }
    }
}
