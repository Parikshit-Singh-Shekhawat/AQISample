package com.airindexapp.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airindexapp.AppViewModel
import com.airindexapp.R
import com.airindexapp.adapter.AQIndexAdapter
import com.airindexapp.databinding.FragmentHomeBinding
import java.util.ArrayList
import com.airindexapp.MainActivity

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {

    var model: AppViewModel? = null
    val TAG: String = FragmentHome::class.simpleName.toString()
    var binding: FragmentHomeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.setContentView(requireActivity(), R.layout.fragment_home);
        populateData();
        model = ViewModelProvider(requireActivity()).get(AppViewModel::class.java)
        model?.showSharedVMToast?.observe(this) { uiState ->
            if (uiState.size > 0) {
                val adapter = binding?.recyclerView?.adapter as AQIndexAdapter
                adapter.setDataList(uiState)
            }
        }
        return view
    }


    private fun populateData() {

        binding?.recyclerView?.also {

            it.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            it.addItemDecoration(
                DividerItemDecoration(
                    context,
                    LinearLayoutManager.HORIZONTAL
                )
            )
            it.adapter = AQIndexAdapter(object : AQIndexAdapter.ItemSelected {
                override fun itemSelected(item: String) {
                    Log.e(TAG, item);
                    val bundle = bundleOf("cityName" to item)
                    findNavController().navigate(
                        R.id.action_fragmentHome_to_fragmentHistory,
                        bundle
                    )
                }
            })

        }
    }
}