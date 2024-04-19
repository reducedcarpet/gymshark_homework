package net.firestaff.mcp.gymsharkhomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import net.firestaff.mcp.gymsharkhomework.ui.ProductNavigation
import net.firestaff.mcp.gymsharkhomework.ui.theme.GymsharkHomeworkTheme
import net.firestaff.mcp.gymsharkhomework.viewmodels.ProductViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: ProductViewModel by viewModels()
        viewModel.fetchCategories(this)

        setContent {
            GymsharkHomeworkTheme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProductNavigation(navController, viewModel)
                }
            }
        }
    }
}

