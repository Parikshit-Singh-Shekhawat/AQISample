package com.airindexapp.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.airindexapp.AppViewModel
import com.airindexapp.R
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import android.graphics.Color
import com.airindexapp.adapter.AQIndexAdapter
import com.airindexapp.db.AQIndexTable
import com.airindexapp.getColorResourceForAQI
import com.airindexapp.millisToDate
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

import com.github.mikephil.charting.interfaces.datasets.IBarDataSet

import java.util.ArrayList
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.AxisBase










// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "cityName"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHistory.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHistory : Fragment() {
    // TODO: Rename and change types of parameters
    private var cityName: String? = null
    var model: AppViewModel?=null
    val TAG:String=FragmentHistory::class.simpleName.toString()
    var barChart:BarChart?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            cityName = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         model= ViewModelProvider(requireActivity()).get(AppViewModel::class.java)
        model?.allRecords?.observe(this) { uiState ->
            if(uiState.size>0) {
                setBarChart(uiState)
            }
        }

        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        barChart=view.findViewById(R.id.barChart)
        model?.getRecordsByName(cityName!!);

    }

    private fun setBarChart(records:List<AQIndexTable>) {
        val bars: MutableList<IBarDataSet> = ArrayList()
        var count:Int=1;
        for (items in records){
            Log.d(TAG,items.city_name)
            val entries = ArrayList<BarEntry>()
            entries.add(BarEntry(count.toFloat(), items.aqi_value.toFloat()))
            val dataset = BarDataSet(entries, millisToDate(items.timestamp))
            dataset.color = getColorResourceForAQI(items.aqi_value.toFloat())
            bars.add(dataset)
            count++
        }

        val description=Description()
        description.text=cityName
        val data = BarData(bars)
        data.barWidth = 0.5f
        barChart?.description=description
        barChart?.setData(data)
        barChart?.animateY(2000)

    }

}