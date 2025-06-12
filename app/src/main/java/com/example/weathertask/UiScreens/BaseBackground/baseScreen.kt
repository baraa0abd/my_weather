package com.example.weathertask.UiScreens.BaseBackground

import android.location.Location
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource // Assuming you have icons in your resources
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.UiScreens.degreeText.WeatherDisplay
import com.example.weathertask.UiScreens.weatherDetails.TodayForecast
@Composable
fun BaseBackground() {
    Box(
        modifier = Modifier
            .size(395.dp,1000.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF87CEFA), Color.White),
                    startY = 0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally // Center-aligns all children
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            UpperAni()
            TodayForecast()
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

