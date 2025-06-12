package com.example.weathertask.UiScreens.BaseBackground

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weathertask.UiScreens.degreeText.WeatherDisplay
import com.example.weathertask.UiScreens.weatherDetails.TodayForecast

// Define your light and dark theme gradients
private val LightBackgroundGradient = listOf(Color(0xFF87CEFA), Color.White)
private val DarkBackgroundGradient = listOf(Color(0xFF1E3A8A), Color(0xFF121212))

@Composable
fun BaseBackground() {
    val isDarkTheme = isSystemInDarkTheme()
    val backgroundGradient = if (isDarkTheme) {
        DarkBackgroundGradient
    } else {
        LightBackgroundGradient
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = backgroundGradient,
                    startY = 0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(32.dp))
            UpperAni()
            TodayForecast()
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

// Helper function to check if dark theme is enabled
@Composable
fun isSystemInDarkTheme(): Boolean {
    return when (LocalConfiguration.current.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
        Configuration.UI_MODE_NIGHT_YES -> true
        else -> false
    }
}
