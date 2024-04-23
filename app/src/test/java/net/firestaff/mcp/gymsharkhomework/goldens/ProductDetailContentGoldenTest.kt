package net.firestaff.mcp.gymsharkhomework.goldens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import net.firestaff.mcp.gymsharkhomework.ui.product.ProductDetailContent
import net.firestaff.mcp.gymsharkhomework.utils.TestTheme
import net.firestaff.mcp.gymsharkhomework.utils.testProduct
import org.junit.Rule
import org.junit.Test

class ProductDetailContentGoldenTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        theme = "Theme.GymsharkHomework"
    )

    @Test
    fun launchComposable() {
        paparazzi.snapshot {
            TestTheme {
                Scaffold(containerColor = Color.White) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        ProductDetailContent(testProduct)
                    }
                }
            }
        }
    }
}
