package com.bagmanovam.simpleruntest

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bagmanovam.simpleruntest.presentation.home.HomeScreen

@Composable
fun SimpleRunNavHost(
    navHostController: NavHostController,
) {
    NavHost(
        navController = navHostController,
        startDestination = Home
    ) {
        composable<Home> {
            HomeScreen(
                onButtonClick = { trainingId ->
                    navHostController.navigate(Training(trainingId))
                }
            )
        }
    }
}