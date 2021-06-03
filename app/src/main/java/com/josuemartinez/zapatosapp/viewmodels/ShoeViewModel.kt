package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.ListingActivity
import timber.log.Timber

class ShoeViewModel : ViewModel() {

    private val shoes: MutableLiveData<List<Shoe>> by lazy { MutableLiveData<List<Shoe>>()
            .also {
            addShoes()
        }
    }

    fun getShoes(): LiveData<List<Shoe>> {
        return shoes
    }

    private fun addShoes() {
        shoes.name = ""
    }


}

