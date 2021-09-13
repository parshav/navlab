package com.pv.navigationlab.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ColorChoicesScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            ColorChoicesItem(color = Color.Cyan) {
                navController.navigate(Routes.Choices.CYAN)
            }
        }
        item {
            Spacer(modifier = Modifier.size(8.dp))
        }
        item {
            ColorChoicesItem(color = Color.Yellow) {
                navController.navigate(Routes.Choices.YELLOW)
            }
        }
        item {
            Spacer(modifier = Modifier.size(8.dp))
        }
        item {
            ColorChoicesItem(color = Color.White) {
                navController.navigate(Routes.Choices.WHITE)
            }
        }
    }
}
