package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josuemartinez.zapatosapp.models.Shoe

class ShoeViewModel : ViewModel() {


    val selectedShoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())

    fun saveShoeData(item: MutableList<Shoe>) {
        selectedShoes.value = item
    }


}

