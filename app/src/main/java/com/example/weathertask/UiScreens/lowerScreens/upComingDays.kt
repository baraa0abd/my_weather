package com.example.weathertask.UiScreens.lowerScreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun UpComingDays(){
    Column(
        modifier = Modifier
            .size(336.dp,471.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            modifier = Modifier
                .width(336.dp)
                .height(24.dp),
            verticalAlignment = Alignment.CenterVertically // Vertical alignment: Middle
        ) {
            Text(
                text = "Next 7 days",
                color = Color(0xFF060414),
                fontWeight = FontWeight.SemiBold, // Weight: 600 is equivalent to SemiBold
                fontSize = 20.sp, // Size: 20px
                letterSpacing = 0.25.sp, // Letter spacing: 0.25px
                lineHeight = 20.sp // Line height: 100% of 20px is 20
            )
        }

        Box(
            contentAlignment = Alignment.Center
        ){
            WeeklyForecastList()
        }
    }
}