package com.example.appmeteorologia.data.repository

import com.example.appmeteorologia.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, lng: Double): WeatherInfo
}