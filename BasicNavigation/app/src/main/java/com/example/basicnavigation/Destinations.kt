package com.example.basicnavigation

interface Destinations{
    val route_destination:String
}

object Dashboard:Destinations{
    override val route_destination = "Home"
}

object DetailScreen:Destinations{
    override val route_destination = "Details"
}