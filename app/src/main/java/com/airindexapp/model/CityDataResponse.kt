package com.airindexapp.model

import java.text.DecimalFormat

class CityDataResponse (var city: String,
var aqi: Float,
) {
    override fun toString(): String {
        return "Category [city: ${this.city}, aqi: ${this.aqi}]"
    }

}