package net.firestaff.mcp.gymsharkhomework.ui.lists

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.google.gson.Gson
import net.firestaff.mcp.gymsharkhomework.R
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.ProductListTile
import java.net.URLEncoder

@Composable
fun ProductList(products: List<Product>, navController: NavController) {

    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = stringResource(id = R.string.products),
            modifier = Modifier.padding(vertical = 16.dp),
        )
        products.forEach { product ->
            ProductListTile(
                title = product.title,
                trailing = { Text(product.price.toString()) },
                onClick = {
                    navController.navigate(
                        "productDetail/${product.id}"
                    )
                },
                //leading = { ProductImage(url = product.url, productName = product.title) }
            )
        }
    }
}