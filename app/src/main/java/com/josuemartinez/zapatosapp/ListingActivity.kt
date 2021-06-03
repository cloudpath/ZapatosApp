package com.josuemartinez.zapatosapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.josuemartinez.zapatosapp.databinding.ActivityListingBinding
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel

class ListingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Obtain the ViewModel component.
        val userModel: ShoeViewModel by viewModels()

        // Inflate view and obtain an instance of the binding class.
        val binding: ActivityListingBinding = DataBindingUtil.setContentView(this, R.layout.activity_listing)
        // Assign the component to a property in the binding class.
        binding.shoes = userModel

        //binding.shoeName.text = shoes.name


    }
}

