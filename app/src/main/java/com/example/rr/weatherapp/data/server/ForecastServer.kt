package com.example.rr.weatherapp.data.server

import com.example.rr.weatherapp.data.db.ForecastDb
import com.example.rr.weatherapp.domain.model.ForecastList
import com.example.rr.weatherapp.domain.model.datasource.ForecastDataSource

class ForecastServer(val dataMapper: ServerDataMapper = ServerDataMapper(),
                     val forecastDb: ForecastDb = ForecastDb()): ForecastDataSource {
    override fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList? {
        val result = ForecastByZipCodeRequest(zipCode).execute()
        val converted = dataMapper.convertToDomain(zipCode, result)
        forecastDb.saveForecast(converted)
        return forecastDb.requestForecastByZipCode(zipCode, date)
    }
}