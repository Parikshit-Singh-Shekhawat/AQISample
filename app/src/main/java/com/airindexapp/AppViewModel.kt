package com.airindexapp

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.airindexapp.db.AQIndexTable
import com.airindexapp.db.AppDatabase
import com.airindexapp.db.DatabaseRepository
import com.airindexapp.model.CityDataModel
import com.airindexapp.model.CityDataResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.launch
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*

class AppViewModel (app: Application) : AndroidViewModel(app) ,ViewModelListener{

    val TAG:String=AppViewModel::class.simpleName.toString()
    val showSharedVMToast = MutableLiveData<List<AQIndexTable>>()
    val allRecords =MutableLiveData<List<AQIndexTable>>()
    val gson = Gson()
    val timeInterval:Int=30*1000
    var lastUpdateTime:Long=0
    var repository:DatabaseRepository
    val df = DecimalFormat("#.##")
    val cal=Calendar.getInstance()
    val instance:AppViewModel;
    init {
        val aqiDb=AppDatabase.getDatabase(context = app).aqiDao()
        repository= DatabaseRepository(aqiDb)
        df.roundingMode = RoundingMode.CEILING
        instance=this
    }

    fun startSocket(){
        viewModelScope.launch {
            WebSocketObject.createSocket(instance);
        }
    }

    fun stopSocket(){
        WebSocketObject.closeSocket()
    }

    override fun socketMessage(response: String) {
        Log.d(TAG,response)
        val currentTime: Long = Calendar.getInstance().timeInMillis
        if (lastUpdateTime <= 0) {
            lastUpdateTime = currentTime
        }
        if (currentTime - lastUpdateTime >= timeInterval || lastUpdateTime == currentTime) {
            viewModelScope.launch {
                val arrayTutorialType = object : TypeToken<List<CityDataResponse>>() {}.type
                var tutorials: List<CityDataResponse> = gson.fromJson(response, arrayTutorialType)

                val newData = mutableListOf<AQIndexTable>()
                for (item in tutorials) {
                    newData.add(
                        AQIndexTable(
                            id = null,
                            city_name = item.city,
                            aqi_value = df.format(item.aqi).toString(),
                            timestamp = cal.timeInMillis
                        )
                    )
                }
                addRecord(newData)
                getRecords()
            }
        }
        lastUpdateTime = currentTime
    }

     private suspend fun addRecord(data:List<AQIndexTable>){

           val result= repository.insertMultipleData(data)
            Log.e(TAG,result.toString())
    }

    private  suspend fun getRecords(){
            val rec=repository.getLatestData()
            showSharedVMToast.postValue(rec)

    }

    fun getRecordsByName(cityName:String){
//        var res: List<AQIndexTable>?=null
        viewModelScope.launch {
             allRecords.postValue(repository.getDataByCity(cityName))
        }
//       return res;
    }

    override fun socketConnected(response: String) {
        Log.d(TAG,response)
    }

    override fun socketClosed(response: String) {
        Log.d(TAG,response)
        WebSocketObject.webSocket=null
//        WebSocketObject.listener=null
    }

    override fun socketClosing(response: String) {
        Log.d(TAG,response)
    }

    override fun socketFailed(response: String) {
        Log.d(TAG,response)
    }


    override fun onCleared() {
        super.onCleared()
        WebSocketObject.closeSocket();
    }

}

interface  ViewModelListener{

    fun socketMessage(response:String)
    fun socketConnected(response:String)
    fun socketClosed(response:String)
    fun socketClosing(response:String)
    fun socketFailed(response:String)
}

