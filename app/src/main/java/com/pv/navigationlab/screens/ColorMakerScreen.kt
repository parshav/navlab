package com.pv.navigationlab.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ColorMakerScreen(
    navController: NavController
) {
    var r by remember {
        mutableStateOf(0)
    }
    var g by remember {
        mutableStateOf(0)
    }
    var b by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Red : ${r.toInt()}")
        Slider(
            valueRange = 0f..255f,
            value = r.toFloat(),
            steps = 255,
            onValueChange = {
                r = it.toInt()
            }
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Green : ${g.toInt()}")
        Slider(
            valueRange = 0f..255f,
            value = g.toFloat(),
            steps = 255,
            onValueChange = {
                g = it.toInt()
            }
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Blue : ${b.toInt()}")
        Slider(
            valueRange = 0f..255f,
            value = b.toFloat(),
            steps = 255,
            onValueChange = {
                b = it.toInt()
            }
        )
        Spacer(modifier = Modifier.size(16.dp))

        Box(
            modifier = Modifier
                .size(width = 200.dp, height = 75.dp)
                .background(Color(r, g, b))
                .clickable {
                    navController.navigate("custom?red=${r}?green=${g}?blue=${b}")
                }
        )
    }
}
