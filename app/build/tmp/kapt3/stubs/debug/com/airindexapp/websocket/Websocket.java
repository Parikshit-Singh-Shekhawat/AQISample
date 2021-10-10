package com.airindexapp.websocket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\"\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/airindexapp/websocket/Websocket;", "Lokhttp3/WebSocketListener;", "listener", "Lcom/airindexapp/ViewModelListener;", "(Lcom/airindexapp/ViewModelListener;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getListener", "()Lcom/airindexapp/ViewModelListener;", "onClosed", "", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "onClosing", "onFailure", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "app_debug"})
public final class Websocket extends okhttp3.WebSocketListener {
    @org.jetbrains.annotations.NotNull()
    private final com.airindexapp.ViewModelListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = null;
    
    public Websocket(@org.jetbrains.annotations.NotNull()
    com.airindexapp.ViewModelListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airindexapp.ViewModelListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    public void onOpen(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
    }
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
    okio.ByteString bytes) {
    }
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onClosed(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    @java.lang.Override()
    public void onClosing(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t, @org.jetbrains.annotations.Nullable()
    okhttp3.Response response) {
    }
}