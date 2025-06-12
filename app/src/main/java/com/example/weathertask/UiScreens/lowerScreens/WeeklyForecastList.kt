package com.example.weathertask.UiScreens.lowerScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.R
import com.example.weathertask.model.DailyForecast

@Composable
fun WeeklyForecastList() {
    val forecasts = listOf(
        DailyForecast("Monday", R.drawable.sun, 32, 20),
        DailyForecast("Tuesday", R.drawable.cloud, 32, 20),
        DailyForecast("Wednesday", R.drawable.sun, 32, 20),
        DailyForecast("Thursday", R.drawable.sun, 32, 20),
        DailyForecast("Friday", R.drawable.cloud, 32, 20),
        DailyForecast("Saturday", R.drawable.sun, 32, 20),
        DailyForecast("Sunday", R.drawable.cloud, 32, 20)
    )
    Box(
        modifier = Modifier
            .width(336.dp) // Layout: Width
            .wrapContentHeight() // Layout: Height Hug
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(24.dp)) // Layout: Radius
                .background(Color.White.copy(alpha = 0.7f)) // Colors: #FFFFFF 70%
                .border(
                    width = 1.dp, // Borders: 1px
                    color = Color(0xFF060414).copy(alpha = 0.08f), // Borders: #060414 8%
                    shape = RoundedCornerShape(24.dp) // Layout: Radius
                )
                .padding(vertical = 4.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            forecasts.forEach { forecast ->
                DailyForecastItem(forecast = forecast)
            }
        }
    }
}