package com.airindexapp

import com.airindexapp.websocket.Websocket
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit

import okhttp3.WebSocket


object WebSocketObject {

    val  socketUrl:String?
    lateinit var listener:Websocket
    init {
         socketUrl="ws://city-ws.herokuapp.com/";
        println("WebSocket invokded.")
    }

    val mClient = OkHttpClient.Builder()
        .pingInterval(15, TimeUnit.SECONDS) // Setting PING Frame Transmit Interval
        .build()
    val request = Request.Builder()
        .url(socketUrl)
        .build()

    var webSocket:WebSocket?=null

    fun createSocket(viewModelListener: ViewModelListener){

            listener = Websocket(viewModelListener)
            webSocket = mClient.newWebSocket(request, listener)
            mClient.dispatcher().executorService().shutdown()

    }

    fun closeSocket(){
        webSocket?.close(1000,null)

    }

}