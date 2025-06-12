package data.repository

import domain.models.CurrentWeather
import domain.models.FailedFetchWeatherDataException
import domain.models.NoLocationRetrieved
import domain.repository.WeatherRepository
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json

const val OPEN_METEO_API = "https://api.open-meteo.com/v1/forecast"

class WeatherRepositoryImpl(private val httpClient: HttpClient) : WeatherRepository {
    override suspend fun getCurrentWeather(latitude: Double, longitude: Double): CurrentWeather {
        try {
            val response = httpClient.get(OPEN_METEO_API) {
                parameter("latitude", latitude)
                parameter("longitude", longitude)
                parameter(
                    "current",
                    "temperature_2m,relative_humidity_2m,apparent_temperature,is_day,rain,showers,snowfall,wind_speed_10m,cloud_cover"
                )
            }

            if (response.status != HttpStatusCode.OK) {
                throw FailedFetchWeatherDataException(
                    "Weather API returned error status: ${response.status}"
                )
            }

            // Parse the response directly using Ktor's receive
            val jsonResponse = response.body<String>()
            val json = Json { ignoreUnknownKeys = true }
            return json.decodeFromString<CurrentWeather>(jsonResponse)

        } catch (e: Exception) {
            throw when (e) {
                is FailedFetchWeatherDataException -> e
                else -> NoLocationRetrieved("Failed to retrieve location data: ${e.message}")
            }
        }
    }
}