package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        val binding = FragmentWelcomeBinding.inflate(inflater, container, false)

        binding.instructionButton.setOnClickListener{
            view?.findNavController()?.navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionFragment())
        }

        return binding.root


    }


}
