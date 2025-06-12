package com.example.weathertask.UiScreens.lowerScreens
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.model.DailyForecast

@Composable
fun DailyForecastItem(forecast: DailyForecast) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp), // Inner padding for each row
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Day of the week
        Text(
            text = forecast.day,
            color = Color(0xFF060414),
            fontSize = 18.sp,
            modifier = Modifier.weight(1f) // Takes up available space
        )

        // Weather Icon
        Icon(
            painter = painterResource(id = forecast.icon),
            contentDescription = "Weather for ${forecast.day}",
            tint = Color.Unspecified, // Use original icon colors
            modifier = Modifier.size(40.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        // Max Temperature
        Text(
            text = "↑ ${forecast.maxTemp}°C",
            color = Color(0xFF060414),
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.width(16.dp))

        // Min Temperature
        Text(
            text = "↓ ${forecast.minTemp}°C",
            color = Color(0xFF060414),
            fontSize = 18.sp
        )
    }
}