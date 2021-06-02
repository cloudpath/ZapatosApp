package com.josuemartinez.zapatosapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josuemartinez.zapatosapp.models.Shoe
import timber.log.Timber

class ShoeViewModel : ViewModel() {

    private val shoes: MutableLiveData<List<Shoe>> by lazy { MutableLiveData<List<Shoe>>()
//            .also {
//            loadUsers()
//        }
    }

    fun getShoes(): LiveData<List<Shoe>> {
        return shoes
    }
//
//    private fun loadUsers() {
//        // Do an asynchronous operation to fetch users.
//    }





//    override fun onCleared() {
//        super.onCleared()
//
//        val shoe1 = Shoe("Jordan", 10.5, "Nike", "Jordan Nike new shoes" )
//
//    }
}

