package com.josuemartinez.zapatosapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.josuemartinez.zapatosapp.databinding.ActivityListingBinding
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel

class ListingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListingBinding

    private lateinit var viewModel: ShoeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate view and obtain an instance of the binding class.
        val binding: ActivityListingBinding = DataBindingUtil.setContentView(this, R.layout.activity_listing)

        // Specify the current activity as the lifecycle owner.
        binding.lifecycleOwner = this

        viewModel = ViewModelProvider(this).get(ShoeViewModel::class.java)


    }
}

