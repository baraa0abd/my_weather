package com.example.weathertask.UiScreens.BaseBackground

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import domain.models.Location
import domain.repository.LocationRepository
import domain.util.location_getter.LocationFetcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun LocationComponent(
    locationRepository: LocationRepository,
    locationFetcher: LocationFetcher,
    modifier: Modifier = Modifier
) {
    val locationLabel = remember { mutableStateOf("Loading...") }

    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            try {
                val location = locationRepository.getLocation(locationFetcher)
                locationLabel.value = location.label
            } catch (e: Exception) {
                locationLabel.value = "Location unavailable"
            }
        }
    }

    Row(
        modifier = modifier
            .offset(133.dp, 64.dp)
            .width(94.dp)
            .height(24.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.size(24.dp)) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Location icon",
                modifier = Modifier.size(20.dp)
            )
        }
        Box(modifier = Modifier.size(66.dp, 20.dp)) {
            Text(
                text = locationLabel.value,
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
fun LocationComponentPreview() {
    val mockRepository = object : LocationRepository {
        override suspend fun getLocation(locationFetcher: LocationFetcher): Location {
            return Location(
                latitude = 33.3152,
                longitude = 44.3661,
                label = "Baghdad"
            )
        }
    }

    val mockFetcher = object : LocationFetcher {
        override suspend fun getLocation(): Location {
            return Location(
                latitude = 33.3152,
                longitude = 44.3661,
                label = "Baghdad"
            )
        }
    }

    LocationComponent(
        locationRepository = mockRepository,
        locationFetcher = mockFetcher
    )
}