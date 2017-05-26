package com.example.rr.weatherapp.domain.model.datasource

import com.example.rr.weatherapp.domain.model.ForecastList

/**
 * Created by Jay-Ar Gabriel on 5/26/2017.
 */
interface ForecastDataSource {
    fun requestForecastByZipCode(zipcode: Long, date: Long): ForecastList?
}