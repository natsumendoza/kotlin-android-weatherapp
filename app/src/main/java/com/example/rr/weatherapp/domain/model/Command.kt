package com.example.rr.weatherapp.domain.model

/**
 * Created by Jay-Ar Gabriel on 5/24/2017.
 */
interface Command<T> {
    fun execute(): T
}