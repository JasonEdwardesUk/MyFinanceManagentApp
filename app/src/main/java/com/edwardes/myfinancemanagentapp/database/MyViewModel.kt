package com.edwardes.myfinancemanagentapp.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    // Define your LiveData objects here
    private val _myLiveData = MutableLiveData<String>()
    val myLiveData: LiveData<String>
        get() = _myLiveData

    // Example function to update the LiveData
    fun updateData(newData: String) {
        _myLiveData.value = newData
    }
}