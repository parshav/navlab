package com.pv.navigationlab.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ParentComposable() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable(Routes.Drawer.GREEN) {
            ColorModalScreen(navController, color = Color.Green)
        }
        composable(Routes.Drawer.MAGENTA) {
            ColorModalScreen(navController, color = Color.Magenta)
        }
    }
}

