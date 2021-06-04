package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.josuemartinez.zapatosapp.databinding.ActivityListingBinding
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel


class ListingActivity() : AppCompatActivity() {


    private lateinit var viewModel: ShoeViewModel
    private lateinit var binding: ActivityListingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate view and obtain an instance of the binding class.
        binding = DataBindingUtil.setContentView(this, R.layout.activity_listing)

        viewModel = ViewModelProvider(this).get(ShoeViewModel::class.java)

        observeViewModel()
        initListeners()

    }
    private fun initListeners() {
//        btn_badge?.setOnClickListener {
//            viewModel.incrementBadgeCount()
//        }
    }

    private fun observeViewModel() {

        viewModel.badgeCount.observe(this, Observer {
            showToast(it)
        })

    }

    private fun showToast(value: Int) {
        Toast.makeText(this, value.toString(), Toast.LENGTH_LONG).show()
    }





        // Obtain the ViewModel component.
//        val shoeViewModel: ShoeViewModel by viewModels()

//        shoeViewModel.getShoes().observe(this, Observer<List<Shoe>>{
//        })

        // Assign the component to a property in the binding class.
//        binding.shoes = shoeViewModel


}




