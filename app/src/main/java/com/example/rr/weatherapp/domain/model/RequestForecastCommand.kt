package com.example.rr.weatherapp.domain.model

import com.example.rr.weatherapp.data.ForecastDataMapper
import com.example.rr.weatherapp.data.ForecastRequest
import com.example.rr.weatherapp.domain.model.datasource.ForecastProvider

/**
 * Created by Jay-Ar Gabriel on 5/24/2017.
 */
class RequestForecastCommand(val zipCode: Long,
                             val forecastProvider: ForecastProvider = ForecastProvider()): Command<ForecastList> {

    companion object {
        val DAYS = 7
    }

    override fun execute(): ForecastList {
        return forecastProvider.requestByZipCode(zipCode, DAYS)
    }
}