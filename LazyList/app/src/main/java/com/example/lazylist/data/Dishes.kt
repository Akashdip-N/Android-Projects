package com.example.lazylist.data

data class Dish(
    val name: String,
    val description: String,
    val price: String,
    val image: String
)

val dish = listOf<Dish>(
    Dish(
        name = "Greek Salad",
        description = "The famous greek salad of " +
                "crispy lettuce, peppers, olives, " +
                "our Chicago ...",
        price = "$12.99",
        image = "https://images.unsplash.com/photo-1586281388251-7d4d795f1f5f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FsYWR8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80"
    ),
    Dish(
        name = "Greek Salad",
        description = "The famous greek salad of " +
                "crispy lettuce, peppers, olives, " +
                "our Chicago ...",
        price = "$12.99",
        image = "https://images.unsplash.com/photo-1586281388251-7d4d795f1f5f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FsYWR8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80"
    ),
    Dish(
        name = "Greek Salad",
        description = "The famous greek salad of " +
                "crispy lettuce, peppers, olives, " +
                "our Chicago ...",
        price = "$12.99",
        image = "https://images.unsplash.com/photo-1586281388251-7d4d795f1f5f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FsYWR8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80"
    )
)