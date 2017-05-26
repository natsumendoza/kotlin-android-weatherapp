package com.example.rr.weatherapp

import android.util.Log
import java.net.URL

/**
 * Created by Jay-Ar Gabriel on 5/23/2017.
 */
class Request (val url: String) {
    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}