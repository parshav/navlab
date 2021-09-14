package com.pv.navigationlab.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun CustomColorScreen(
    red: Int,
    blue: Int,
    green: Int
) {
    ColorScreen(color = Color(red, blue, green))
}
