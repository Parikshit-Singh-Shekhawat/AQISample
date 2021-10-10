package com.airindexapp

import android.util.Log
import androidx.core.content.ContextCompat
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.text.SimpleDateFormat
import java.util.*


private const val DATE_FORMAT = "hh:mm a"

fun millisToDate(millis: Long) : String {
    return SimpleDateFormat(DATE_FORMAT, Locale.US).format(Date(millis))
}

fun getColorResourceForAQI(res:Float):Int{
    when (res) {
        in 0.0 .. 50.00 ->  return  R.color.good
        in 50.01 .. 100.00 ->  return R.color.satisfactory
        in 100.01 .. 200.0 ->  return R.color.moderate
        in 200.01 .. 300.0 ->  return R.color.poor
        in 300.01 .. 400.0 ->  return R.color.very_poor
        else ->   return R.color.severe
    }
}