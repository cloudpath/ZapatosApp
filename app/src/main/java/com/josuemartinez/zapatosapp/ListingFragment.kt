package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentListingBinding

class ListingFragment  : Fragment() {


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle? ): View {
        // Inflate the layout for this fragment
        val binding: FragmentListingBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_listing, container, false)

        binding.fab.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_listingFragment_to_detailsFragment)
        }




        return binding.root
    }
}
