package com.airindexapp.db

import androidx.lifecycle.LiveData

class DatabaseRepository(private val aqiDao:AQIDao) {

    suspend fun insertData(aqiRecord:AQIndexTable):Long= aqiDao.insertRecord(aqiRecord)

    suspend fun insertMultipleData(aqiRecord:List<AQIndexTable>):List<Long> = aqiDao.insertRecords(aqiRecord)

    suspend  fun getLatestData():List<AQIndexTable> = aqiDao.getlatestData()

    suspend fun getDataByCity(cityName:String):List<AQIndexTable> = aqiDao.getDataByCity(cityName)

}