package com.example.football.module

import com.example.data.FootballRepositoryMock
import com.example.domain.repository.FootballRepository
import com.example.domain.usecase.FootballUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TestModule {
    @Provides
    @Singleton
    fun provideFootballRepository() : FootballRepository{
        return FootballRepositoryMock()
    }
    @Provides
    @Singleton
    fun provideUseCase(repository: FootballRepository) : FootballUseCase{
        return FootballUseCase(repository)
    }
}