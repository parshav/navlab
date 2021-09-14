package com.pv.navigationlab.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColorMakerScreen() {

    val r = remember {
        mutableStateOf(0f)
    }
    val g = remember {
        mutableStateOf(0f)
    }
    val b = remember {
        mutableStateOf(0f)
    }
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Red : ${r.value.toInt()}")
        Slider(
            valueRange = 0f..255f,
            value = r.value,
            steps = 255,
            onValueChange = {
                r.value = it
            }
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Green : ${g.value.toInt()}")
        Slider(
            valueRange = 0f..255f,
            value = g.value,
            steps = 255,
            onValueChange = {
                g.value = it
            }
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Blue : ${b.value.toInt()}")
        Slider(
            valueRange = 0f..255f,
            value = b.value,
            steps = 255,
            onValueChange = {
                b.value = it
            }
        )
        Spacer(modifier = Modifier.size(16.dp))

        Box(
            modifier = Modifier
                .size(width = 200.dp, height = 75.dp)
                .background(Color(r.value.toInt(), g.value.toInt(), b.value.toInt()))
        )
    }
}
