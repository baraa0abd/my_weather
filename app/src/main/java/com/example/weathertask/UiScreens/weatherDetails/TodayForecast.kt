package com.example.weathertask.UiScreens.weatherDetails
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
import androidx.compose.foundation.layout.wrapContentHeight
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
fun TodayForecast() {
    Column(
        modifier = Modifier
            .size(388.dp,428.dp)
            .offset(12.dp, 479.dp),
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                hourlyForecasts.forEach { forecast ->
                    HourlyForecastItem(forecast = forecast)
                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TodayForecastPreview() {
    TodayForecast()
}
