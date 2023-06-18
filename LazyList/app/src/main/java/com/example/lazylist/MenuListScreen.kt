package com.example.lazylist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.Locale.Category

@Composable
fun MenuListScreen(){
    Column {
        LazyRow(){
            items(Category)
        }
    }
}
@Composable
fun MenuCategory(){
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.LightGray),
        shape = RoundedCornerShape(40),
        modifier = Modifier.padding(5.dp)
    ) {
        Text(
            text = "Lunch"
        )
    }
}

@Composable
fun MenuDish() {
    Card {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ) {
            Column {
                Text(text = "Greek Salad",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "The famous greek salad of " +
                        "crispy lettuce, peppers, olives, " +
                        "our Chicago ...",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(text = "$12.99",
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(painter = painterResource(id = R.drawable.greeksalad),
                contentDescription = "",
            )
        }
    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color.LightGray,
        thickness = 1.dp
    )
}