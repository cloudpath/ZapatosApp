package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josuemartinez.zapatosapp.models.Shoe

class ShoeViewModel : ViewModel(){


    private val selectedShoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())

    fun getLiveData(): LiveData<MutableList<Shoe>> = selectedShoes

    fun saveShoeData(item: MutableList<Shoe>) {
        selectedShoes.value = item
    }

    var shoe = Shoe()


}

