package com.example.dayfinder

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun display_inputArea()
{
    Column(
        modifier = Modifier
            .background(
                Color(0xFF495E57)
            )
            .fillMaxHeight()
            .padding(20.dp)
    ) {
        InputArea()
        copyright()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputArea() {
    val context = LocalContext.current
    var text by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Text(
            text = stringResource(
                id = R.string.instructions
            ),
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(
                    Color(0xFF495E57)
                )
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = text,
            modifier = Modifier
                .padding(
                    20.dp
                ),
            onValueChange = {text = it},
            label = {
                Text(
                    "Enter the Date",
                    color = Color.White
                )
            }
        )
        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Data Submitted successfully",
                    Toast.LENGTH_LONG)
                    .show()
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                Color(0xFFF4CE14)
            )
        ) {
            Text(
                text = stringResource(id = R.string.submit),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333)
            )
        }
    }
}

@Composable
fun copyright()
{
    Column() {
        Text(
            text = stringResource(
                id = R.string.copyright
            ),
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier
        )
    }
}