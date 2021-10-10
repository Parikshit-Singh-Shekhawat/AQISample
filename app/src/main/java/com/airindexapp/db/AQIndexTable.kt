package com.airindexapp.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "aqi_table")
data class AQIndexTable (

    @PrimaryKey(autoGenerate = true)
    val id:Int?,
    @ColumnInfo(name="city_name")
    val city_name:String,
    @ColumnInfo(name="aqi_value")
    val aqi_value:String,
    @ColumnInfo(name="timestamp")
    val timestamp:Long=Calendar.getInstance().timeInMillis
)

public fun getStringAQI(aqiValue: Float):String{
    return aqiValue.toString()
}