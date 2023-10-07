package com.edwardes.myfinancemanagentapp.database

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MyFragment : Fragment() {
    private lateinit var viewModel: MyViewModel


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize ViewModel
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        // Observe transformed data
        viewModel.myLiveData.observe(viewLifecycleOwner, Observer<String> {
            // Handle updated UI with transformedData
        })

        // To update the LiveData, call viewModel.setData(newData)
    }
}
