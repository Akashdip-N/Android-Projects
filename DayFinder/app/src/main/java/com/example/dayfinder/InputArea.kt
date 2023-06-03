package com.example.dayfinder

import android.widget.EditText
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
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
    ) {
        InputArea()
        copyright()
    }
}

@Composable
fun InputArea() {
    val context = LocalContext.current
    val inputvalue = remember {
        mutableStateOf(TextFieldValue())
    }
    Column(){
        Text(
            text = stringResource(
                id = R.string.instructions
            ),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .background(
                    Color(0xFF495E57)
                )
                .fillMaxWidth()
        )
        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Order received. Thank you!",
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