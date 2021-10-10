package com.airindexapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006!"}, d2 = {"Lcom/airindexapp/WebSocketObject;", "", "()V", "listener", "Lcom/airindexapp/websocket/Websocket;", "getListener", "()Lcom/airindexapp/websocket/Websocket;", "setListener", "(Lcom/airindexapp/websocket/Websocket;)V", "mClient", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "getMClient", "()Lokhttp3/OkHttpClient;", "request", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "socketUrl", "", "getSocketUrl", "()Ljava/lang/String;", "webSocket", "Lokhttp3/WebSocket;", "getWebSocket", "()Lokhttp3/WebSocket;", "setWebSocket", "(Lokhttp3/WebSocket;)V", "closeSocket", "", "createSocket", "viewModelListener", "Lcom/airindexapp/ViewModelListener;", "app_debug"})
public final class WebSocketObject {
    @org.jetbrains.annotations.NotNull()
    public static final com.airindexapp.WebSocketObject INSTANCE = null;
    @org.jetbrains.annotations.Nullable()
    private static final java.lang.String socketUrl = null;
    public static com.airindexapp.websocket.Websocket listener;
    private static final okhttp3.OkHttpClient mClient = null;
    private static final okhttp3.Request request = null;
    @org.jetbrains.annotations.Nullable()
    private static okhttp3.WebSocket webSocket;
    
    private WebSocketObject() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSocketUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airindexapp.websocket.Websocket getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.airindexapp.websocket.Websocket p0) {
    }
    
    public final okhttp3.OkHttpClient getMClient() {
        return null;
    }
    
    public final okhttp3.Request getRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.WebSocket getWebSocket() {
        return null;
    }
    
    public final void setWebSocket(@org.jetbrains.annotations.Nullable()
    okhttp3.WebSocket p0) {
    }
    
    public final void createSocket(@org.jetbrains.annotations.NotNull()
    com.airindexapp.ViewModelListener viewModelListener) {
    }
    
    public final void closeSocket() {
    }
}