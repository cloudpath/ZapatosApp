package com.josuemartinez.zapatosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_welcome)
        Timber.plant(Timber.DebugTree())



//        topAppBar.setNavigationOnClickListener {
//            // Handle navigation icon press
//        }
//
//        topAppBar.setOnMenuItemClickListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.instructions -> {
//                    // Handle favorite icon press
//                    true
//                }
//                else -> false
//            }
//        }



    }




}


