package com.example.appupdate.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(){

    //var valordoTextField = "Ola Amigos"
    //recompose
    var valordoTextField = remember {
        mutableStateOf("valordoTextField")
    }

    var contador = remember {
        mutableStateOf(0)
    }

    Column (modifier = Modifier.padding(20.dp)) {
        Text(text = "Titulo da Tarefa")

        TextField(
            value = valordoTextField.value,
            onValueChange = {
                valordoTextField.value = it
                Log.i("### fun TaskScreen(){...", it)
            })
        Spacer(modifier = Modifier.width(20.dp) )

        Button(onClick = {
            contador.value = contador.value +1

        }) {
            Text(text = "Incrementa Contador")
        }
        Text(contador.value.toString())
    }
}