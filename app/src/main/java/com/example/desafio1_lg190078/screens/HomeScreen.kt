package com.example.desafio1_lg190078.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.desafio1_lg190078.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){
    Scaffold (
        topBar = {
            TopAppBar() {
                Text(text = "Desafío Práctico 1 DSM")
            }
        }
            ){
BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { navController.navigate(route = AppScreens.Ejercicio1.route) }) {
            Text(text = "Ejercicio 1")
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = { navController.navigate(route = AppScreens.Ejercicio2.route) }) {
            Text(text = "Ejercicio 2")
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = { navController.navigate(route = AppScreens.Ejercicio3.route)}) {
            Text(text = "Ejercicio 3")
        }
    }
}