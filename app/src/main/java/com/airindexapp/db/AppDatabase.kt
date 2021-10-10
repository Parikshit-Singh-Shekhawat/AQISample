package com.airindexapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(AQIndexTable::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
        abstract fun aqiDao(): AQIDao

        companion object{
            private var  INSTANCE:AppDatabase?=null

            fun getDatabase(context: Context):AppDatabase{
                if(INSTANCE!=null){
                    return INSTANCE!!
                }
                INSTANCE=  Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java, "adddatabse"
                        ).build()

                return INSTANCE!!
            }
        }

    }
