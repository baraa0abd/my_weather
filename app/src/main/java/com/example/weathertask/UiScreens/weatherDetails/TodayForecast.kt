package com.example.weathertask.UiScreens.weatherDetails
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.R
import com.example.weathertask.UiScreens.lowerScreens.UpComingDays
import com.example.weathertask.model.HourlyForecastInfo

@Composable
fun TodayForecast() {
    Column(
        modifier = Modifier
            .size(388.dp,923.dp)
            .offset(12.dp, 215.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ){
        val hourlyForecasts = listOf(
            HourlyForecastInfo(painterResource(id = R.drawable.sun), "25°C", "11:00"),
            HourlyForecastInfo(painterResource(id = R.drawable.sun), "25°C", "12:00"),
            HourlyForecastInfo(painterResource(id = R.drawable.sun), "25°C", "01:00"),
            HourlyForecastInfo(painterResource(id = R.drawable.cloud), "25°C", "02:00")
        )

        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            WeatherMetricsGrid()
            Text(
                text = "Today",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            LazyRow(
                modifier = Modifier.size(388.dp, 120.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                items(hourlyForecasts) { forecast ->
                    HourlyForecastItem(forecast = forecast)
                }
            }
            UpComingDays()
        }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TodayForecastPreview() {
    TodayForecast()
}
