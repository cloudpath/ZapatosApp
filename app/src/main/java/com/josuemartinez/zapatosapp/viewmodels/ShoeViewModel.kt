package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josuemartinez.zapatosapp.models.Shoe


class ShoeViewModel : ViewModel(){

    private val selectedShoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())

    var shoe = Shoe()
        set(value) {
            if (value != field)
                field = value
        }


    fun getShoeData(): LiveData<MutableList<Shoe>> = selectedShoes

    fun saveShoeData(item: Shoe?) {
        item?.let {
            selectedShoes.value?.add(item)
        }
    }

}

