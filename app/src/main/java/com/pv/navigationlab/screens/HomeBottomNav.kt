package com.pv.navigationlab.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun HomeBottomNav(
    navController: NavController
) {
    BottomNavigation(
        Modifier.background(Color.Green)
    ) {
        BottomNavigationItem(
            modifier = Modifier.background(Color.Black),
            selected = false,
            onClick = {
                navController.navigate(Routes.Home.BLACK)
            },
            icon = {}
        )
        BottomNavigationItem(
            modifier = Modifier.background(Color.Red),
            selected = false,
            onClick = {
                navController.navigate(Routes.Home.RED)
            },
            icon = {}
        )
        BottomNavigationItem(
            modifier = Modifier.background(Color.Gray),
            selected = false,
            onClick = {
                navController.navigate(Routes.Home.CHOICES)
            },
            icon = {}
        )
    }
}

@Preview
@Composable
private fun PreviewHomeBottomNav() {

}
