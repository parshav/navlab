package com.pv.navigationlab.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DrawerContent(
    navController: NavController,
    onDrawerItemClick: () -> Unit
) {
    LazyColumn {
        item {
            ColorChoicesItem(color = Color.Magenta) {
                onDrawerItemClick()
                navController.navigate(Routes.Drawer.MAGENTA)
            }
        }
        item {
            Spacer(modifier = Modifier.size(8.dp))
        }
        item {
            ColorChoicesItem(color = Color.Green) {
                onDrawerItemClick()
                navController.navigate(Routes.Drawer.GREEN)
            }
        }
    }
}

