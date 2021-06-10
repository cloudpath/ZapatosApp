package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josuemartinez.zapatosapp.models.Shoe
import timber.log.Timber

class ShoeViewModel : ViewModel(){

    private val selectedShoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())

    fun getLiveData(): LiveData<MutableList<Shoe>> = selectedShoes

    var shoe = Shoe()
        set(value) {
            if (value != field)
                field = value
        }

    fun saveShoeData(item: Shoe?) {
        item?.let {
            selectedShoes.value?.add(item)
        }
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("ShoeViewModel destroyed!")
    }

}

