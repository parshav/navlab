package com.pv.navigationlab.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ColorChoicesNav() {
    val newNavController = rememberNavController()
    NavHost(navController = newNavController, startDestination = Routes.Choices.HOME) {
        composable(Routes.Choices.HOME) {
            ColorChoicesScreen(newNavController)
        }
        composable(Routes.Choices.CYAN) {
            ColorScreen(color = Color.Cyan)
        }
        composable(Routes.Choices.YELLOW) {
            ColorScreen(color = Color.Yellow)
        }
        composable(Routes.Choices.WHITE) {
            ColorScreen(color = Color.White)
        }
    }
}