package net.firestaff.mcp.gymsharkhomework

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GSApplication : Application() {
    // This class doesn't need to contain any logic.
    // It just needs to exist and be annotated for Hilt.
}