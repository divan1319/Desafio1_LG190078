package com.example.desafio1_lg190078.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.desafio1_lg190078.Ejercicio1
import com.example.desafio1_lg190078.Ejercicio2
import com.example.desafio1_lg190078.Ejercicio3
import com.example.desafio1_lg190078.screens.HomeScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.route){
        composable(route=AppScreens.HomeScreen.route){
            HomeScreen(navController)
        }
        composable(route=AppScreens.Ejercicio1.route){
            Ejercicio1(navController)
        }
        composable(route=AppScreens.Ejercicio2.route){
            Ejercicio2(navController)
        }
        composable(route=AppScreens.Ejercicio3.route){
            Ejercicio3(navController)
        }
    }
}