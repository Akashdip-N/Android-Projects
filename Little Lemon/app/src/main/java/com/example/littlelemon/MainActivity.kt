package com.example.littlelemon

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var toplayout : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // this inflates the view
        toplayout = findViewById(R.id.topLayout)

        // setting the background of the Layout to green
        toplayout.setBackgroundColor(Color.parseColor("#495E57"))

        // creating the textview
        var textview = TextView(this)

        // adding the resources to the TextView
        textview.text = resources.getText(R.string.little_lemon)

        // adding the textview color to the TextView
        textview.setTextColor(Color.parseColor("#F4CE14"))

        // Adding the textview to the layout
        toplayout.addView(textview)
    }


}