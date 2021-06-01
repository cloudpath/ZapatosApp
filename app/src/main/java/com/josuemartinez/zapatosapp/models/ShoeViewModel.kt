package com.josuemartinez.zapatosapp.models

import androidx.lifecycle.ViewModel
import timber.log.Timber

class ShoeViewModel : ViewModel() {
    init {
        Timber.i("ShoeViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()



        val shoe1 = Shoe("Jordan", 10.5, "Nike", "Jordan Nike new shoes" )

    }
}
