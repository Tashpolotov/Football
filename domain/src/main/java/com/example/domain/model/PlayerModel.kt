package com.example.domain.model

data class PlayerModel(
    val name: String,
    val img: Int,
    val country : String,
    val position:String,
    val number: Int,
    val game:Int,
    val goal: Int,
)
data class Players(
    val name: String,
    val img: Int
)