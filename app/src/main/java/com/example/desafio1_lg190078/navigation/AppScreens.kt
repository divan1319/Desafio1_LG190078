package com.example.desafio1_lg190078.navigation

sealed class AppScreens(val route: String){
    object HomeScreen: AppScreens("home_screen")
    object Ejercicio1: AppScreens("ejercicio1_screen")
    object Ejercicio2: AppScreens("ejercicio2_screen")
    object Ejercicio3: AppScreens("ejercicio3_screen")
}
