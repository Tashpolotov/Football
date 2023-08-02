package com.example.domain.model

data class ClubDetailModel(
    val name:String,
    val img: Int,
    val country: String,
    val stadium: String,
    val stadiumImg: Int,
    val players: String,
)
data class ClubName(
    val name: String,
    val img: Int
)