package com.example.rr.weatherapp.data.server

import com.example.rr.weatherapp.data.ForecastResult
import com.google.gson.Gson

class ForecastByZipCodeRequest(val zipCode: Long, val gson: Gson = Gson()) {
    companion object {
        private val APP_ID = "5d690106c060a533e84def5a85cc228e"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }

    fun execute() : ForecastResult {
        val forecastJsonStr = java.net.URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}