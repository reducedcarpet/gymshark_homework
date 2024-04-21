package net.firestaff.mcp.gymsharkhomework.goldens

import androidx.compose.ui.tooling.preview.Devices.PIXEL_5
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import net.firestaff.mcp.gymsharkhomework.MainActivity
import net.firestaff.mcp.gymsharkhomework.ui.screens.MainScreen
import org.junit.Rule
import org.junit.Test

class MainScreenGoldenTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        theme = "android:Theme.Material.Light.NoActionBar"
    )

    @Test
    fun launchComposable() {
        paparazzi.snapshot {
            MainActivity()
        }
    }
}