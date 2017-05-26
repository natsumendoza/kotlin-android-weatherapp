package com.example.rr.weatherapp.ui.utils

import android.app.Application
import android.database.sqlite.SQLiteOpenHelper
import com.example.rr.weatherapp.extensions.DelegatesExt

/**
 * Created by Jay-Ar Gabriel on 5/25/2017.
 */
class App: Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}