package com.pv.navigationlab.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation

@Composable
fun HomeNavHost(navController: NavHostController) {
    // cant create remember for nested graphs
    NavHost(navController = navController, startDestination = "choices") {
        composable("black") {
            ColorScreen(color = Color.Black)
        }
        composable("red") {
            ColorScreen(color = Color.Red)
        }
        navigation("choicesHome", "choices") {
            ColorChoicesNavHost(navController)
        }
    }
}
