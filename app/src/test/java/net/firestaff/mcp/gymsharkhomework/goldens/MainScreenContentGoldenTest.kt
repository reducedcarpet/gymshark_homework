package net.firestaff.mcp.gymsharkhomework.goldens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.MutableLiveData
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.google.gson.reflect.TypeToken
import net.firestaff.mcp.gymsharkhomework.infrastructure.GsonService
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.screens.MainScreenContent
import net.firestaff.mcp.gymsharkhomework.utils.TestTheme
import net.firestaff.mcp.gymsharkhomework.utils.listJson
import net.firestaff.mcp.gymsharkhomework.utils.navControllerMock
import net.firestaff.mcp.gymsharkhomework.utils.wishlistViewModelMock
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito


class MainScreenContentGoldenTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        theme = "Theme.GymsharkHomework"
    )

    @Test
    fun launchComposable() {
        val type = object : TypeToken<List<Product>>() {}.type
        val products = GsonService.gson.fromJson<List<Product>>(listJson, type)

        val mockLiveData = MutableLiveData<Set<String>>()
        Mockito.`when`(wishlistViewModelMock.wishlist).thenReturn(mockLiveData)

        paparazzi.snapshot {
            TestTheme {
                Scaffold(containerColor = Color.White) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        MainScreenContent(
                            navControllerMock,
                            wishlistViewModelMock,
                            products.associateBy { it.id }
                        )
                    }
                }
            }
        }
    }
}