package com.example.weathertask.UiScreens.weatherDetails

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weathertask.model.WeatherMetricInfo
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.R
import com.example.weathertask.model.HourlyForecastInfo

@Composable
fun WeatherMetricsGrid() {
    // Dummy data for the grid
    val weatherMetrics = listOf(
        WeatherMetricInfo(painterResource(id = R.drawable.img_3), "13 KM/h", "Wind"),
        WeatherMetricInfo(painterResource(id = R.drawable.img_4), "24%", "Humidity"),
        WeatherMetricInfo(painterResource(id = R.drawable.img_5), "2%", "Rain"),
        WeatherMetricInfo(painterResource(id = R.drawable.img_8), "2", "UV Index"),
        WeatherMetricInfo(painterResource(id = R.drawable.img_7), "1012 hPa", "Pressure"),
        WeatherMetricInfo(painterResource(id = R.drawable.img_6), "22°C", "Feels like")
    )

    // LazyVerticalGrid is the best way to create a grid in Compose
    LazyVerticalGrid(
        columns = GridCells.Fixed(3), // 3 columns
        verticalArrangement = Arrangement.spacedBy(16.dp), // Vertical spacing between items
        horizontalArrangement = Arrangement.spacedBy(16.dp), // Horizontal spacing
    ) {
    }
}