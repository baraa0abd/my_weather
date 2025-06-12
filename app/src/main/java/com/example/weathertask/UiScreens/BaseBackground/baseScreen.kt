package com.example.weathertask.UiScreens.BaseBackground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weathertask.UiScreens.degreeText.WeatherDisplay
import com.example.weathertask.UiScreens.lowerScreens.UpComingDays
import com.example.weathertask.UiScreens.weatherDetails.TodayForecast
import com.example.weathertask.UiScreens.weatherDetails.WeatherDetails

@Composable
fun BaseBackground() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF87CEFA), Color.White),
                    startY = 0f,
                    endY = Float.POSITIVE_INFINITY
                ),
                shape = RoundedCornerShape(20.dp)
            )
    ) {
        location()
        BaseSun()
        baseCloude()
        WeatherDisplay()
        TodayForecast()
    }
}

@Preview
@Composable
fun BaseBackgroundPreview() {
    BaseBackground()
}