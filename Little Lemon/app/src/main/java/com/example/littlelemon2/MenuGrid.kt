package com.example.littlelemon2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuGrid(){
    GridCell();
}

@Composable
fun GridCell() {
    Card(
        modifier = Modifier
            .padding(8.dp)
    ) {
    Box(
        modifier = Modifier
            .requiredSize(180.dp, 180.dp)
            .padding()
    ){
        Image(
            painter = painterResource(id = R.drawable.greeksalad),
            contentDescription = "Greek Salad"
        )
        Text(
            text = "Greek Salad",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
                .background(Color.White)
                .align(Alignment.TopStart)
        )
        Text(
            text = "$12.99",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp)
                .background(Color.White)
                .align(Alignment.BottomEnd)
        )
    }
    }
}