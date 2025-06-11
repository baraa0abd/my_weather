package com.example.weathertask.model

import androidx.compose.ui.graphics.painter.Painter

data class WeatherMetricInfo(
    val icon: Painter,
    val value: String,
    val label: String
)