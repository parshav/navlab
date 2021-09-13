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

@Composable
fun ColorChoicesScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(100.dp)
                    .background(Color.Cyan)
            )
        }
        item {
            Spacer(modifier = Modifier.size(8.dp))
        }
        item {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(100.dp)
                    .background(Color.Yellow)
            )
        }
        item {
            Spacer(modifier = Modifier.size(8.dp))
        }
        item {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(100.dp)
                    .background(Color.White)
            )
        }
    }
}
