package com.example.lazylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.example.lazylist.ui.theme.LazyListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyListTheme {
               setContent(){
                   Column {
                       MenuCategory()
                       MenuDish()

                   }
               }
            }
        }
    }
}