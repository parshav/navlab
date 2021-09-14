package com.pv.navigationlab.screens

import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ColorModalScreen(
    navController: NavController,
    color: Color
) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Black
            ) {
                Button(
                    modifier = Modifier
                        .size(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White
                    ),
                    onClick = {
                        navController.popBackStack()
                    },
                ) {
                }
            }
        }
    ) {
        ColorScreen(color = color)
    }
}
