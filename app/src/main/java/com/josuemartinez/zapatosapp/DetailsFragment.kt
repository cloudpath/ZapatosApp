package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentDetailsBinding
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel

class DetailsFragment : Fragment() {


    private val viewModel: ShoeViewModel by activityViewModels()

    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)

        binding.saveButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_detailsFragment_to_listingFragment)
        }

        binding.cancelButton.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_detailsFragment_to_listingFragment)
        }

        return binding.root
    }




}