package com.pv.navigationlab.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.ColorChoicesNavHost(navController: NavController) {
    composable(Routes.Choices.HOME) {
        ColorChoicesScreen(navController)
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
