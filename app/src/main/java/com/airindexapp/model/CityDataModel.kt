package com.airindexapp.model

import java.text.DecimalFormat
import java.util.*

data class CityDataModel(
	var city: String,
	var aqi: Float,
) {
	override fun toString(): String {
		return "Category [city: ${this.city}, aqi: ${this.aqi}]"
	}
	val df = DecimalFormat("#.##")
	init{
		aqi=String.format("%.2f", aqi).toFloat()
	}
//	val num = 1.34567
//	val df = DecimalFormat("#.##")
//	df.roundingMode = RoundingMode.CEILING
//
//	println(df.format(num))
}