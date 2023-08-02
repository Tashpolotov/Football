package com.example.domain.repository

import com.example.domain.model.*

interface FootballRepository {

    fun getCountry() : List<CountryModel>

    fun getPlayers(name : String) : List<Players>

    fun getClubsForCountry(country: String): List<ClubName>

    fun getClubs(club: String) : List<ClubDetailModel>

    fun getPlayersDetails(name: String) : List<PlayerModel>
}