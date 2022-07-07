package com.example.weathercompose.di

import com.example.weathercompose.data.pack.DefaultLocationTracker
import com.example.weathercompose.domain.location.LocationTracker
import com.example.weathercompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepository: WeatherRepository): WeatherRepository
}