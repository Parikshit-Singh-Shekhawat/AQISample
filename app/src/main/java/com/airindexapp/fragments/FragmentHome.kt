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







// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var navController: NavController? = null
    var model: AppViewModel? = null
    val TAG: String = FragmentHome::class.simpleName.toString()
    var binding: FragmentHomeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    fun goToHistory() {
//        val navHostFragment = activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//
//        navController?.navigate(R.id.action_fragmentHome_to_fragmentHistory)
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
//                it.layoutManager= LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
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
//                    val action = FragmentHomeDirections.actionFragmentHomeToFragmentHistory()
//                    goToHistory();

                    findNavController().navigate(
                        R.id.action_fragmentHome_to_fragmentHistory,
                        bundle
                    )
//                    val action = FragmentHomeDirections.actionFragmentHomeToFragmentHistory()
//                    findNavController().navigate(action)

                }
            })

        }
    }
}