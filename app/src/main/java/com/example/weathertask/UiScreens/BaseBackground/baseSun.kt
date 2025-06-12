package com.example.weathertask.UiScreens.BaseBackground

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weathertask.R

@Composable
fun BaseSun() {
    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .size(165.34.dp,235.36.dp)
            .offset(82.29.dp,134.59.dp)
            .border(1.dp, Color.Transparent, shape = CircleShape)
    ) {
        Image(
            painter = painterResource(id = R.drawable.sun),
            contentDescription = "Sun",
        )
    }
}