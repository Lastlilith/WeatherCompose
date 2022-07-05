package com.example.weathercompose.data.remote

import com.squareup.moshi.Json
import retrofit2.http.Field

class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)