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
    composable("choicesHome") {
        ColorChoicesScreen(navController)
    }
    composable("cyan") {
        ColorScreen(color = Color.Cyan)
    }
    composable("yellow") {
        ColorScreen(color = Color.Yellow)
    }
    composable("white") {
        ColorScreen(color = Color.White)
    }
}
