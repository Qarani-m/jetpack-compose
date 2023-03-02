package com.example.myapplication

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Column {
//                        Greeting("martin")
//                        customText(text = "Lorrrrrrr")
//                    }

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        customItem(weight = 3f, color =MaterialTheme.colors.secondary )
                        customItem(weight = 1f, color =MaterialTheme.colors.primary )



                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun customText(text: String){
    Text(
        text = "My name is $text",
        style= Typography.h5,
        )
}

@Composable
fun ColumnScope.customItem(weight: Float, color: Color){
    Surface(modifier = Modifier
        .width(200.dp)
        .weight(weight),
        color = color
    ){}

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            customItem(weight = 3f, color =MaterialTheme.colors.secondary )
            customItem(weight = 1f, color =MaterialTheme.colors.primary )



        }
    }
}