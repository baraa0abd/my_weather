package com.example.weathertask.UiScreens.weatherDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items // <-- Important: You might need to add this import
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.R

data class WeatherMetricInfo(
    val icon: Painter,
    val value: String,
    val label: String
)

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

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        // ERROR WAS HERE: You must use the items() function to provide the list
        items(weatherMetrics) { metric ->
            // For each 'metric' in the list, display this composable
            WeatherDetailItem(metric = metric)
        }
    }
}

/**
 * A composable to display a single weather metric item.
 */
@Composable
fun WeatherDetailItem(metric: WeatherMetricInfo) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(vertical = 16.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                painter = metric.icon,
                contentDescription = metric.label,
                tint = Color(0xFF30A2FF),
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = metric.value,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black
            )
            Text(
                text = metric.label,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0F5F9)
@Composable
fun WeatherMetricsGridPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        WeatherMetricsGrid()
    }
}