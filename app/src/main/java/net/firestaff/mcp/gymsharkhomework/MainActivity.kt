package net.firestaff.mcp.gymsharkhomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import net.firestaff.mcp.gymsharkhomework.ui.ProductNavigation
import net.firestaff.mcp.gymsharkhomework.ui.theme.GymsharkHomeworkTheme
import net.firestaff.mcp.gymsharkhomework.viewmodels.ProductViewModel


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        val viewModel: ProductViewModel by viewModels()
        viewModel.fetchProducts(this)

        setContent {
            GymsharkHomeworkTheme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProductNavigation(navController)
                }
            }
        }
    }
}

