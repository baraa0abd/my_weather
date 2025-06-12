package com.example.weathertask.UiScreens.weatherDetails
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
fun HourlyForecastItem(forecast: HourlyForecastInfo) {
    Column(
        modifier = Modifier
            .size(88.dp,120.dp)
            .border(1.dp, Color.LightGray, shape = RoundedCornerShape(20.dp))
            .background(Color(0x06041414))
    ) {
        Box(
            modifier = Modifier
                .size(64.dp,58.dp)
                .offset(y=-12.dp)
        ){
            Icon(
                painter = forecast.icon,
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                tint = Color.Unspecified // Use original colors of the drawable
            )
        }
        Column(
            modifier = Modifier
                .offset(23.dp,8.dp)
                .size(36.dp,42.dp)
,            verticalArrangement = Arrangement.spacedBy(1.dp)
        ){
            Text(text = forecast.temperature, fontWeight = FontWeight.SemiBold, fontSize = 16.sp, color = Color.Black)
            Text(text = forecast.time, fontSize = 14.sp, color = Color.Gray)
        }
    }
}