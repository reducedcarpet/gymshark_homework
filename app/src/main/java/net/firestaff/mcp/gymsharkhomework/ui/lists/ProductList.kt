package net.firestaff.mcp.gymsharkhomework.ui.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.google.gson.Gson
import net.firestaff.mcp.gymsharkhomework.R
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.ProductImage
import net.firestaff.mcp.gymsharkhomework.ui.ProductListTile
import java.net.URLEncoder

@Composable
fun ProductList(products: Map<String, Product>, navController: NavController) {

    Column(modifier = Modifier.padding(2.dp)) {
        Text(
            text = stringResource(id = R.string.products),
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
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