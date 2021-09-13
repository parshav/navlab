package com.pv.navigationlab.screens

import android.util.Log
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pv.navigationlab.toggle
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    val backStackState = navController.currentBackStackEntryAsState()
    val isNested: Boolean = !Routes.Home.contains(backStackState.value?.destination?.route)

    val inf = rememberInfiniteTransition()
    val angle by inf.animateFloat(
        initialValue = 0F, targetValue = 360F, animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000
            )
        )
    )

    Scaffold(
        bottomBar = {
            HomeBottomNav(navController)
        },
        topBar = {
            TopAppBar(
                backgroundColor = Color.Green
            ) {
                Button(
                    modifier = Modifier
                        .size(32.dp)
                        .rotate(
                            if (isNested) angle else 0f
                        ),
                    onClick = {
                        if (isNested) {
                            navController.popBackStack()
                        } else {
                            scope.launch { scaffoldState.drawerState.toggle() }
                        }
                    },
                ) {
                }
            }
        },
        scaffoldState = scaffoldState,
        drawerContent = {
            HomeDrawerContent()
        }
    ) {
        HomeNavHost(navController = navController)
    }
}

@Composable
@Preview
private fun PreviewHomeScreen() {
    HomeScreen()
}
