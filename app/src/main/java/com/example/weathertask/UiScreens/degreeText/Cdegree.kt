package com.example.weathertask.UiScreens.degreeText

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.R

@Composable
fun WeatherDisplay() {
    Box(
        modifier = Modifier
            .size(168.dp, 143.dp)
            .offset(95.5.dp, 312.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Temperature Text
            Text(
                text = "24°C",
                color = Color(0xFF060414),
                fontSize = 64.sp,
                lineHeight = 64.sp,
                letterSpacing = 0.25.sp,
            )

            Text(
                text = "Partly cloudy",
                color = Color(0xFF060414).copy(alpha = 0.88f),
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.15.sp,
                modifier = Modifier.padding(bottom = 8.dp) // Added some space
            )
            HighLowTempDisplay()
        }
    }
}

@Composable
fun HighLowTempDisplay() {
    Row(
        modifier = Modifier
            .height(40.dp) // Set a fixed height
            .background(
                color = Color(0xFFD0E4F5), // Light blue background color
                shape = RoundedCornerShape(50) // Pill shape
            )
            .padding(horizontal = 16.dp), // Padding inside the pill
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // High Temperature
        Image(
            painter = painterResource(id = R.drawable.arrowupward),
            contentDescription = "arrow",
            modifier = Modifier
                .size(12.dp)  // Width/Height: 12px
                .rotate(180f)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "32°C",
            color = Color.DarkGray,
            fontSize = 16.sp
        )

        // Divider
        Text(
            text = "|",
            color = Color.DarkGray.copy(alpha = 0.6f),
            modifier = Modifier.padding(horizontal = 8.dp),
            fontSize = 16.sp
        )

        // Low Temperature
        Image(
            painter = painterResource(id = R.drawable.img_2),
            contentDescription = "arrow",
            modifier = Modifier
                .size(12.dp)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "20°C",
            color = Color.DarkGray,
            fontSize = 16.sp
        )
    }
}

// Preview for the specific component you wanted to build
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun HighLowTempDisplayPreview() {
    HighLowTempDisplay()
}

// Preview for the entire parent component
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WeatherDisplayPreview() {
    // To make the preview more realistic, let's center the WeatherDisplay
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        WeatherDisplay()
    }
}