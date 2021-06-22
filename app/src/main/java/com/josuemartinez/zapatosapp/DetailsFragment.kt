package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentDetailsBinding
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel

class DetailsFragment : Fragment() {


    private val viewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding = FragmentDetailsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.shoeViewModel = viewModel
        binding.shoe = Shoe()

        viewModel.buildNewShoe()

        binding.saveButton.setOnClickListener{
            viewModel.saveShoeData()
            view?.findNavController()?.navigate(DetailsFragmentDirections.actionDetailsFragmentToListingFragment())
        }

        binding.cancelButton.setOnClickListener {
            view?.findNavController()?.navigate(DetailsFragmentDirections.actionDetailsFragmentToListingFragment())
        }

        return binding.root
    }




}