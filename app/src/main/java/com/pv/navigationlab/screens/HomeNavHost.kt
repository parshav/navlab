package com.pv.navigationlab.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun HomeNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "choices") {
        composable("black") {
            ColorScreen(color = Color.Black)
        }
        composable("red") {
            ColorScreen(color = Color.Red)
        }
        composable("choices") {
            ColorChoicesScreen()
        }
    }
}
