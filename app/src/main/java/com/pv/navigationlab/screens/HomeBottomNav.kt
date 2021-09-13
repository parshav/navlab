package com.pv.navigationlab.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeBottomNav() {
    BottomNavigation(
        Modifier.background(Color.Green)
    ) {
        BottomNavigationItem(
            modifier = Modifier.background(Color.Black),
            selected = true,
            onClick = { },
            icon = {},
            selectedContentColor = Color.Green,
            unselectedContentColor = Color.Gray
        )
        BottomNavigationItem(
            selected = false,
            onClick = { },
            icon = {},
            selectedContentColor = Color.Red,
            unselectedContentColor = Color.Blue
        )
    }
}

@Preview
@Composable
private fun PreviewHomeBottomNav() {

}
