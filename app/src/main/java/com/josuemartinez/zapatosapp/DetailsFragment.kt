package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.josuemartinez.zapatosapp.databinding.FragmentDetailsBinding
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel

class DetailsFragment : Fragment() {

    private lateinit var saveButton: Button

    private val viewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: FragmentDetailsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_details, container, false)
        binding.shoeViewModel = viewModel
//        binding.shoe = Shoe()

        saveButton.setOnClickListener{
        }

        return binding.root
    }


}