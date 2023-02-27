package com.example.desafio1_lg190078

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio3(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar {
                Text(text = "Calculadora Basica")
            }
        }
    ) {
        Ejercicio3Content(navController)
    }


}
@Composable
fun Ejercicio3Content(navController: NavController){
    var n1 by remember {
        mutableStateOf("")
    }
    var n2 by remember {
        mutableStateOf("")
    }
    var res by remember {
        mutableStateOf(0f)
    }
    Column(
        modifier = Modifier
            .padding(15.dp)
    ) {
        TextField(value = n1 ,
            onValueChange = {n1 = it},
            label = { Text(text = "Ingresa un numero")} ,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth() )
        Spacer(modifier = Modifier.padding(bottom = 10.dp))
        TextField(value = n2 ,
            onValueChange = {n2 = it},
            label = { Text(text = "Ingresa otro numero")} ,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding( bottom =  15.dp))
        Row(
            modifier = Modifier
                .align(alignment = CenterHorizontally)
        ) {
            Button(onClick = {
                res = n1.toFloat() + n2.toFloat()
            }) {
                Text(text = "+")
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = {
                res = n1.toFloat() - n2.toFloat()
            }) {
                Text(text = "-")
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = {
                res = n1.toFloat() / n2.toFloat()
            }) {
                Text(text = "/")
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = {
                res = n1.toFloat() * n2.toFloat()
            }) {
                Text(text = "*")
            }
        }
        Spacer(modifier = Modifier.padding( bottom =  15.dp))
        Text(text = "El resultado es: $res")
    }
}



