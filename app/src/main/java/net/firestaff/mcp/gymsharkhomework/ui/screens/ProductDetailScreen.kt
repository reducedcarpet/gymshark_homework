package net.firestaff.mcp.gymsharkhomework.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import com.google.gson.Gson
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.services.transformImageUrl
import net.firestaff.mcp.gymsharkhomework.ui.TopAppBarScaffold
import java.net.URLDecoder

@Composable
fun ProductDetail(navController: NavController, productJson: String) {
    val decodedJson = URLDecoder.decode(productJson, "UTF-8")

    val gson = Gson()
    val product = gson.fromJson(decodedJson, Product::class.java)

    TopAppBarScaffold(
        title = product.title,
        navController = navController,
        content = {
            ProductDetailContent(product)
        }
    )
}

@Composable
fun ProductDetailContent(
    product: Product
) {
    Card(
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Name: ${product.title}")
            Spacer(modifier = Modifier.height(8.dp))

            if (product.description.isNotEmpty()) {
                Text(text = "Description: ${product.description}")
                Spacer(modifier = Modifier.height(8.dp))
            }

            Text(text = "Price: ${product.price}")
            Spacer(modifier = Modifier.height(8.dp))

            if (product.sku.isNotEmpty()) {
                //val painter = rememberImagePainter(
                //    request = ImageRequest.Builder(LocalContext.current)
                //        .data(transformImageUrl(product.url))
                //        .build()
                //)

                //Image(
                //    painter = painter,
                //    contentDescription = "Product Image for ${product.title}",
                //    modifier = Modifier.fillMaxWidth()
                //)
            }

        }
    }
}