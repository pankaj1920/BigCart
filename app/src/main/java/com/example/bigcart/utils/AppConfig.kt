package com.example.bigcart.utils

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.example.bigcart.ui.theme.bottomBarColor
import com.example.bigcart.ui.theme.statusBarColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun changeSystemUiColor(darkTheme: Boolean = isSystemInDarkTheme()) {
    val systemUiController = rememberSystemUiController()
    if (darkTheme) {
        systemUiController.setSystemBarsColor(color = statusBarColor, darkIcons = false)
        systemUiController.setNavigationBarColor(color = bottomBarColor, darkIcons = false)
    } else {
        systemUiController.setSystemBarsColor(color = statusBarColor, darkIcons = false)
        systemUiController.setNavigationBarColor(color = bottomBarColor, darkIcons = false)
    }


}