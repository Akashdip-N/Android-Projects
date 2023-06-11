package com.example.basicnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.basicnavigation.ui.theme.BasicNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicNavigationTheme {
                setContent{
                    MyNav()
                }
            }
        }
    }
}

@Composable
fun MyNav(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Dashboard.route_destination
    ){
        composable(Dashboard.route_destination){
            DashBoardScreen(navController)
        }

        composable(DetailScreen.route_destination){
            DetailScreen()
        }
    }
}
