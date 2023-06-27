package com.example.equpmentdb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.equpmentdb.screens.AddScreen
import com.example.equpmentdb.screens.AddViewModel
import com.example.equpmentdb.screens.MainScreen

sealed class AllScreens(val route: String) {
    object MainScreen : AllScreens("MainScreen")
    object AddScreen : AllScreens("AddScreen")
}


@Composable
fun EqNavHost(navigator: NavHostController, viewModel: AddViewModel) {
    NavHost(navController = navigator, startDestination = AllScreens.MainScreen.route) {
        composable(AllScreens.MainScreen.route) { MainScreen(viewModel = viewModel) }
        composable(AllScreens.AddScreen.route) { AddScreen(viewModel = viewModel) }
    }
}