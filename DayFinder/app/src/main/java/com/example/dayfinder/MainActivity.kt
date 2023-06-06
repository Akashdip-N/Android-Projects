package com.example.dayfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.dayfinder.ui.theme.DayFinderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DayFinderTheme {
                // A surface container using the 'background' color from the theme
                homeScreen()
            }
        }
    }
}

@Composable
@Preview
fun homeScreen(){
    display_inputArea()
}