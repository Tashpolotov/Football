package com.example.domain.usecase

import com.example.domain.repository.FootballRepository

class FootballUseCase(val repository: FootballRepository) {
    operator fun invoke() {
        repository.getCountry()
        repository.getPlayers(name = String())
        repository.getClubsForCountry(country = String())
        repository.getClubs(club = String())
        repository.getPlayersDetails(name = String())
    }
}