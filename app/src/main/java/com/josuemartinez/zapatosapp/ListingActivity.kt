package com.josuemartinez.zapatosapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.models.ShoeViewModel

class ListingActivity : AppCompatActivity() {

    private lateinit var viewModel: ShoeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing)




//        startActivity(
//            Intent(this, ListingFragment::class.java).apply {
//                putExtra("shoe1", shoe1)
//            }
//        )


        viewModel = ViewModelProvider(this).get(ShoeViewModel::class.java)


    }
}