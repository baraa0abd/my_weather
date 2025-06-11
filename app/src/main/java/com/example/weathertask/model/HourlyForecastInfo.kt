package com.example.weathertask.model

import androidx.compose.ui.graphics.painter.Painter

data class HourlyForecastInfo(
    val icon: Painter,
    val temperature: String,
    val time: String
)