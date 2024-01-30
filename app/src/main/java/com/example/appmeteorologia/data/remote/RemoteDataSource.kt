package com.example.appmeteorologia.data.remote

import com.example.appmeteorologia.data.remote.response.WeatherDataResponse

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Double, lng: Double): WeatherDataResponse
}