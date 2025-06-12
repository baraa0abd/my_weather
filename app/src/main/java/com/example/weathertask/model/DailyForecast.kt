package com.example.weathertask.model

import androidx.annotation.DrawableRes

data class DailyForecast(
    val day: String,
    @DrawableRes val icon: Int,
    val maxTemp: Int,
    val minTemp: Int
)
