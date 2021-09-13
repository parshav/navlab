package com.pv.navigationlab.screens

import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pv.navigationlab.toggle
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        bottomBar = {
            HomeBottomNav()
        },
        topBar = {
            TopAppBar(
                backgroundColor = Color.Green
            ) {
                Button(
                    modifier = Modifier.size(32.dp),
                    onClick = {
                        scope.launch { scaffoldState.drawerState.toggle() }
                    }) {
                }
            }
        },
        scaffoldState = scaffoldState,
        drawerContent = {
            Text(text = "This is part of the drawer")
        }
    ) {

    }
}

@Composable
@Preview
private fun PreviewHomeScreen() {
    HomeScreen()
}
