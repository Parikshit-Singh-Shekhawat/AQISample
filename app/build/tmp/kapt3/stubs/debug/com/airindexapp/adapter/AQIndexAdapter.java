package com.airindexapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u0018\u0019\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005\u00a8\u0006\u001b"}, d2 = {"Lcom/airindexapp/adapter/AQIndexAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/airindexapp/adapter/AQIndexAdapter$AQIViewHolder;", "itemClickListener", "Lcom/airindexapp/adapter/AQIndexAdapter$ItemSelected;", "(Lcom/airindexapp/adapter/AQIndexAdapter$ItemSelected;)V", "dataSet", "", "Lcom/airindexapp/db/AQIndexTable;", "getItemClickListener", "()Lcom/airindexapp/adapter/AQIndexAdapter$ItemSelected;", "setItemClickListener", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataList", "data", "AQIViewHolder", "Companion", "ItemSelected", "app_debug"})
public final class AQIndexAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.airindexapp.adapter.AQIndexAdapter.AQIViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.airindexapp.adapter.AQIndexAdapter.ItemSelected itemClickListener;
    private java.util.List<com.airindexapp.db.AQIndexTable> dataSet;
    @org.jetbrains.annotations.NotNull()
    public static final com.airindexapp.adapter.AQIndexAdapter.Companion Companion = null;
    
    public AQIndexAdapter(@org.jetbrains.annotations.NotNull()
    com.airindexapp.adapter.AQIndexAdapter.ItemSelected itemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airindexapp.adapter.AQIndexAdapter.ItemSelected getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    com.airindexapp.adapter.AQIndexAdapter.ItemSelected p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.airindexapp.adapter.AQIndexAdapter.AQIViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.airindexapp.adapter.AQIndexAdapter.AQIViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.airindexapp.db.AQIndexTable> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setAQIColor"})
    @kotlin.jvm.JvmStatic()
    public static final void setTextColor(@org.jetbrains.annotations.NotNull()
    android.view.View textView, @org.jetbrains.annotations.NotNull()
    java.lang.String aqIndex) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setTimeStamp"})
    @kotlin.jvm.JvmStatic()
    public static final void setTimeStamp(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, long timestamp) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/airindexapp/adapter/AQIndexAdapter$ItemSelected;", "", "itemSelected", "", "item", "", "app_debug"})
    public static abstract interface ItemSelected {
        
        public abstract void itemSelected(@org.jetbrains.annotations.NotNull()
        java.lang.String item);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/airindexapp/adapter/AQIndexAdapter$AQIViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "homeRecyclerItemBinding", "Lcom/airindexapp/databinding/HomeRecyclerItemBinding;", "(Lcom/airindexapp/adapter/AQIndexAdapter;Lcom/airindexapp/databinding/HomeRecyclerItemBinding;)V", "getHomeRecyclerItemBinding", "()Lcom/airindexapp/databinding/HomeRecyclerItemBinding;", "setHomeRecyclerItemBinding", "(Lcom/airindexapp/databinding/HomeRecyclerItemBinding;)V", "app_debug"})
    public final class AQIViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.airindexapp.databinding.HomeRecyclerItemBinding homeRecyclerItemBinding;
        
        public AQIViewHolder(@org.jetbrains.annotations.NotNull()
        com.airindexapp.databinding.HomeRecyclerItemBinding homeRecyclerItemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.airindexapp.databinding.HomeRecyclerItemBinding getHomeRecyclerItemBinding() {
            return null;
        }
        
        public final void setHomeRecyclerItemBinding(@org.jetbrains.annotations.NotNull()
        com.airindexapp.databinding.HomeRecyclerItemBinding p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/airindexapp/adapter/AQIndexAdapter$Companion;", "", "()V", "setTextColor", "", "textView", "Landroid/view/View;", "aqIndex", "", "setTimeStamp", "Landroid/widget/TextView;", "timestamp", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.databinding.BindingAdapter(value = {"setAQIColor"})
        @kotlin.jvm.JvmStatic()
        public final void setTextColor(@org.jetbrains.annotations.NotNull()
        android.view.View textView, @org.jetbrains.annotations.NotNull()
        java.lang.String aqIndex) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"setTimeStamp"})
        @kotlin.jvm.JvmStatic()
        public final void setTimeStamp(@org.jetbrains.annotations.NotNull()
        android.widget.TextView textView, long timestamp) {
        }
    }
}