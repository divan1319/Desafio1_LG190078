package com.example.desafio1_lg190078

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlin.math.round

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio1(navController: NavController){
Scaffold(topBar ={
    TopAppBar() {
        Text(text = "Cacular Promedio")
    }
}) {
    Ejercicio1Content(navController)
    
}

}

@Composable
fun Ejercicio1Content(navController: NavController){
    var nota1 by remember { mutableStateOf("") }
    var nota2 by remember { mutableStateOf("") }
    var nota3 by remember { mutableStateOf("") }
    var promedio by remember { mutableStateOf(0f)}
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        TextField(
            value = nota1,
            onValueChange = {nota1= it},
            label = { Text(text = "Nota 1")},
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        )
        TextField(
            value = nota2,
            onValueChange = {nota2= it},
            label = { Text(text = "Nota 2")},
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        )
        TextField(
            value = nota3,
            onValueChange = {nota3= it},
            label = { Text(text = "Nota 3")},
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        )
        Button(
            onClick = {
                val prom = (nota1.toFloat() + nota2.toFloat() + nota3.toFloat() ) / 3
                promedio = round(prom*100) / 100
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Text(text = "Calcular promedio")
        }
        Text(
            text = "El promedio es: $promedio",
            style = MaterialTheme.typography.h6,
            modifier = Modifier.fillMaxWidth()
        )


    }
}