package com.example.weathertask.UiScreens.BaseBackground

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathertask.R

@Composable
fun location() {
    Row(
        modifier = Modifier
            .offset(133.dp, 64.dp)
            .width(94.dp)
            .height(24.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(24.dp,24.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Location icon",
                modifier = Modifier.size(20.dp)
            )
        }
        Box(
            modifier = Modifier
                .size(66.dp, 20.dp)
        ) {
            Text(
                text = "Baghdad",
                style = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    letterSpacing = 0.25.sp,
                    color = Color.Black
                )
            )
        }

    }
}

@Preview
@Composable
fun locationPreview() {
    location()
}