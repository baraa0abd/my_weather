package com.example.weathertask.UiScreens.BaseBackground


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weathertask.R
import com.example.weathertask.UiScreens.degreeText.WeatherDisplay

@Composable
fun baseCloude(){
    Box(
        modifier = Modifier
            .offset(82.94.dp,166.53.dp)
            .size(197.27.dp,133.47.dp)
            .border(1.dp, androidx.compose.ui.graphics.Color.Transparent)
    ){
        Image(
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = "Cloud",
        )
    }
}

@Composable
fun UpperAni(){
    Box(
        modifier = Modifier
            .size(165.34.dp,235.36.dp)
            .offset(-80.dp,-34.59.dp)

    ){
        location()
        BaseSun()
        baseCloude()
        WeatherDisplay()
    }
}
@Preview(showBackground = true)
@Composable
fun BaseBackgroundPreview() {
    BaseBackground()
}
