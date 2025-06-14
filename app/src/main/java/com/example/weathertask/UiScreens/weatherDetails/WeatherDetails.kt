package com.example.weathertask.UiScreens.weatherDetails

import androidx.compose.runtime.Composable
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
fun WeatherDetails() {
    Column(
        modifier = Modifier
            .width(388.dp) // "Width: Fixed (388px)"
            .wrapContentHeight(), // "Height: Hug (428px)"
        verticalArrangement = Arrangement.spacedBy(24.dp) // "Gap: 24px"
    ) {
        TodayForecast()
    }
}

@Preview(showSystemUi = true )
@Composable
fun WeatherDetailsPreview(){
    WeatherDetails()
}