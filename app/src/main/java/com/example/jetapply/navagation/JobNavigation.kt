package com.example.jetapply.navagation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetapply.screens.DetailsScreen
import com.example.jetapply.screens.HomeScreen


@Composable
fun JobNavigation(){

    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = CompanyScreens.HomeScreen.name){

        composable(CompanyScreens.HomeScreen.name){
            HomeScreen(navController)
        }

        composable(CompanyScreens.DetailScreen.name+"/{company}",

            arguments = listOf(navArgument(name = "company"){type = NavType.StringType})){backStackEntry ->

            DetailsScreen(navController = navController,
            backStackEntry.arguments?.getString("company"))
        }


    }
}