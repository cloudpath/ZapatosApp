package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentInstructionBinding

class InstructionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = FragmentInstructionBinding.inflate(inflater, container, false)

        binding.listingButton.setOnClickListener{
            view?.findNavController()?.navigate(InstructionFragmentDirections.actionInstructionFragmentToListingFragment())
        }

        return binding.root
    }


}