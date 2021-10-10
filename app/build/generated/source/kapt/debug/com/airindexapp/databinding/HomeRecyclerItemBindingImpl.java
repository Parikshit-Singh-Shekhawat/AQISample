package com.airindexapp.databinding;
import com.airindexapp.R;
import com.airindexapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeRecyclerItemBindingImpl extends HomeRecyclerItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeRecyclerItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private HomeRecyclerItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.aqiValue.setTag(null);
        this.cityName.setTag(null);
        this.mainContainer.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.updateTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.airindexapp.db.AQIndexTable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.airindexapp.db.AQIndexTable Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        long dataTimestamp = 0;
        java.lang.String dataAqiValue = null;
        com.airindexapp.db.AQIndexTable data = mData;
        java.lang.String dataCityName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.timestamp
                    dataTimestamp = data.getTimestamp();
                    // read data.aqi_value
                    dataAqiValue = data.getAqi_value();
                    // read data.city_name
                    dataCityName = data.getCity_name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.aqiValue, dataAqiValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cityName, dataCityName);
            com.airindexapp.adapter.AQIndexAdapter.setTextColor(this.mainContainer, dataAqiValue);
            com.airindexapp.adapter.AQIndexAdapter.setTimeStamp(this.updateTime, dataTimestamp);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}