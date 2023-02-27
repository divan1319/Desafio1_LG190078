package com.example.desafio1_lg190078

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio2(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar() {
                Text(text = "Salario Neto")
            }
        }
    ) {
        Ejercicio2Content(navController)
    }

}

@Composable
fun Ejercicio2Content(navController: NavController){
    var name by remember {
        mutableStateOf("")
    }
    var salary by remember {
        mutableStateOf("")
    }
    var salario_neto by remember {
        mutableStateOf(0.0)
    }
    var deducciones by remember {
        mutableStateOf(0.0)
    }

    Column(
        modifier = Modifier
            .padding(15.dp)

    ) {
        TextField(value = name,
            onValueChange = {name= it},
            label = { Text(text = "Nombre") },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier
            .padding(bottom = 5.dp))

        TextField(value = salary,
            onValueChange = {salary= it},
            label = { Text(text = "Salario") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier
            .padding(bottom = 5.dp))
        Button(onClick = {
            deducciones = (salary.toDouble() * 0.03)+ (salary.toDouble()*0.04) + (salary.toDouble()*0.05)
            salario_neto =  salary.toDouble() - deducciones

        },
        modifier = Modifier
            .align(alignment = CenterHorizontally)) {
            Text(text = "Calcular Salario Neto")
        }
        Spacer(modifier = Modifier
            .padding(bottom = 5.dp))
        Text(text = "Nombre: $name")
        Text(text = "Salario : $salary")
        Text(text = "Deducciones: $deducciones")
        Text(text = "Salario Neto: $salario_neto")
    }
}
