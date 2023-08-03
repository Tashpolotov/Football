package com.example.domain.model

data class ClubDetailModel(
    val name:String,
    val img: Int,
    val country: String,
    val stadium: String,
    val stadiumImg: Int,
    val players: String,
    val stadiumPeople : Int,
    val clubBurn : String,
    val muchCup : Long,
    val couchClub: String,
    val imgCouch: Int,
    val muchLigaChampoinsCup : Int,
    val muchAplCup : Int,

)
data class ClubName(
    val name: String,
    val img: Int
)