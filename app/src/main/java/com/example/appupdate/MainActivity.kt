package com.example.appupdate

import android.os.Bundle
import android.util.Log
import android.util.Log.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appupdate.telas.TaskScreen
import com.example.appupdate.ui.theme.AppUpdateTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //val navHostController = rememberNavController()


            AppUpdateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //MainScreen()
                    TaskScreen()
                }
            }
        }
    }
}

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
                    Text("btn2")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppUpdateTheme {
        MainScreen()
    }
}