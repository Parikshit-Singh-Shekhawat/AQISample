package com.airindexapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AQIDao {

    @Insert
    suspend fun insertRecord(record: AQIndexTable):Long

    @Insert
    suspend fun insertRecords(record: List<AQIndexTable>):List<Long>

    @Query("Select * FROM aqi_table where city_name=:cityName  Limit 10")
    suspend fun getDataByCity(cityName:String): List<AQIndexTable>

    @Query("SELECT city_name, aqi_value, Max(timestamp) as timestamp FROM aqi_table GROUP BY city_name ORDER BY timestamp DESC")
    suspend  fun getlatestData():List<AQIndexTable>

}