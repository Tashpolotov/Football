package com.example.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.FootballUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountryViewModel @Inject constructor(val useCase: FootballUseCase) : ViewModel() {

    private val _state = MutableStateFlow(FootballViewState())
    val state: StateFlow<FootballViewState> = _state.asStateFlow()

    fun loadPlayerDetail(name: String) {
        viewModelScope.launch {
            val playerDetail = useCase.repository.getPlayersDetails(name)
            _state.value = _state.value.copy(playerDetail = playerDetail)
        }
    }

    fun loadPlayers(name: String) {
        viewModelScope.launch {
            val playerInfo = useCase.repository.getPlayers(name)
            _state.value = _state.value.copy(players = playerInfo)
        }
    }

    fun loadInfoClubs(club: String) {
        viewModelScope.launch {
            val clubsInfo = useCase.repository.getClubs(club)
            _state.value = _state.value.copy(infoClubs = clubsInfo)
        }
    }

    fun loadCountry() {
        val country = useCase.repository.getCountry()
        _state.value = _state.value.copy(country = country)
    }

    fun loadClubsForCountry(country: String) {
        viewModelScope.launch {
            val clubsForCountry = useCase.repository.getClubsForCountry(country)
            _state.value = _state.value.copy(clubs = clubsForCountry)
        }
    }
}