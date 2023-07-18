package com.example.test

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleUI(
                onclick = {
                        count -> Toast.makeText(this, "Count is $count", Toast.LENGTH_SHORT).show()
                })
        }
    }
}

@Composable
fun SimpleUI(onclick: (Int) -> Unit){
    var count : Int = 0
    Button(onClick = {onclick(count++)}){
        Text(text = "Button")
        
    }
}