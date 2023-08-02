package com.example.presentation.viewmodel

import com.example.domain.model.*

data class FootballViewState (
    val country: List<CountryModel> = emptyList(),
    val clubs: List<ClubName> = emptyList(),
    val infoClubs: List<ClubDetailModel> = emptyList(),
    val players: List<Players> = emptyList(),
    val playerDetail: List<PlayerModel> = emptyList()
    )