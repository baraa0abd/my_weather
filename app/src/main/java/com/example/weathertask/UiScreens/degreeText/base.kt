package com.example.weathertask.UiScreens.degreeText

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weathertask.R

@Composable
fun baseText()
{
    Box(
        modifier = Modifier
            .offset(95.5.dp, 312.dp)
            .size(168.dp, 143.dp)
    ){
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {

        }
    }
}