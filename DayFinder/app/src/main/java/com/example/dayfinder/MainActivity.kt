package com.example.dayfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
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
fun homeScreen(){

}