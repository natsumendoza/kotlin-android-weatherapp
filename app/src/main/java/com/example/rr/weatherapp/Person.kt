package com.example.rr.weatherapp

public class Person {
    var name: String = ""
    get() = field.toUpperCase()
    set(value) {
        field = "Name: $value"
    }
}
