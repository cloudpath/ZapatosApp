package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josuemartinez.zapatosapp.models.Shoe

class ShoeViewModel : ViewModel(){

    private val _selectedShoe = MutableLiveData<MutableList<Shoe>>(mutableListOf())

    var shoe: Shoe? = null

    val selectedShoe: MutableLiveData<MutableList<Shoe>>
        get() = _selectedShoe


    // Create New Shoe on Details Fragment
    fun buildNewShoe() {
        shoe = Shoe("", "", 0.0, "")
    }


    fun saveShoeData() {
        val shoeItem = mutableListOf<Shoe>()

        selectedShoe.value?.let {
            shoeItem.addAll(it)
        }

        shoe?.let {
            shoeItem.add(it)
        }

        selectedShoe.value = shoeItem
    }

}
