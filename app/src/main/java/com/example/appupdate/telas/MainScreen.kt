package com.example.appupdate.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen() {
    Column {
        Text(text = "Ola.")
        Text("Bom dia!")
        Row() {

            Button(onClick = {
                Log.i("### MainScreen(){...","Botao1 Clicado!!")
            }) {
                Text("btn1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text("Navegar para TaskScreen")
            }
        }
    }
}