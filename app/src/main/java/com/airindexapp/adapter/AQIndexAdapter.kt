package com.airindexapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.airindexapp.R
import com.airindexapp.databinding.HomeRecyclerItemBinding
import com.airindexapp.db.AQIndexTable
import com.airindexapp.fragments.FragmentHomeDirections
import com.airindexapp.millisToDate

import com.airindexapp.model.CityDataResponse
import java.util.*

class AQIndexAdapter (var itemClickListener: ItemSelected) : RecyclerView.Adapter<AQIndexAdapter.AQIViewHolder>() {
    private var dataSet: List<AQIndexTable> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AQIViewHolder {

        return AQIViewHolder(
            DataBindingUtil
            .inflate(LayoutInflater.from(parent.context), R.layout.home_recycler_item, parent, false))
    }

    override fun onBindViewHolder(holder: AQIViewHolder, position: Int) {
        val data = dataSet[position]

        holder.homeRecyclerItemBinding.data = data
        holder.homeRecyclerItemBinding.executePendingBindings()
        holder.itemView.setOnClickListener{ view ->
            itemClickListener.itemSelected(data.city_name)
        }
    }

    override fun getItemCount() = dataSet.size



     fun setDataList(data:List<AQIndexTable>) {
         dataSet=data
         notifyDataSetChanged()
    }


    open interface ItemSelected {
        fun itemSelected(item:String)
    }

    inner class AQIViewHolder(var homeRecyclerItemBinding: HomeRecyclerItemBinding)
        : RecyclerView.ViewHolder(homeRecyclerItemBinding.root)


    companion object {
        @JvmStatic
        @BindingAdapter("setAQIColor")
        fun setTextColor(textView: View, aqIndex: String) {
            try {
                var drawableResourceId: Int?=null
                when (aqIndex.toFloat()) {
                    in 0.0 .. 50.00 -> drawableResourceId=ContextCompat.getColor(textView.context, R.color.good)
                    in 50.01 .. 100.00 -> drawableResourceId=ContextCompat.getColor(textView.context, R.color.satisfactory)
                    in 100.01 .. 200.0 -> drawableResourceId=ContextCompat.getColor(textView.context, R.color.moderate)
                    in 200.01 .. 300.0 -> drawableResourceId=ContextCompat.getColor(textView.context, R.color.poor)
                    in 300.01 .. 400.0 -> drawableResourceId=ContextCompat.getColor(textView.context, R.color.very_poor)
                    else -> drawableResourceId=ContextCompat.getColor(textView.context, R.color.severe)
                }
                when(textView){
                    is LinearLayoutCompat -> textView.setBackgroundColor(drawableResourceId!!)
                    else -> {
//                      val view=  textView as TextView
//                        view.setTextColor(drawableResourceId!!)
                    }
                }


            } catch (e: Exception) {
                Log.d("TAG", "" + e.printStackTrace())
            }
        }

        @JvmStatic
        @BindingAdapter("setTimeStamp")
        fun setTimeStamp(textView: TextView, timestamp: Long) {
            try {
                when(Calendar.getInstance().timeInMillis-timestamp){
                    in 0 .. 60000-> textView.setText(R.string.time_now)
                    in 60001 .. 120000-> textView.setText(R.string.time_one_minute)
                    else  ->  textView.setText(millisToDate(timestamp))
                }


            } catch (e: Exception) {
                Log.d("TAG", "" + e.printStackTrace())
            }
        }
    }


}