package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeViewModel : ViewModel() {

//    private val shoes = MutableLiveData<List<Shoe>>(mutableListOf())
//
//    fun getShoes(): LiveData<List<Shoe>> = shoes


    private val _badgeCount = MutableLiveData<Int>()
    var number = 0

    val badgeCount: LiveData<Int>
        get() = _badgeCount

    fun incrementBadgeCount() {
        _badgeCount.postValue(++number)
    }


    override fun onCleared() {
        super.onCleared()
        // Dispose All your Subscriptions to avoid memory leaks
    }
}

