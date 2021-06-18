package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.signUpButton.setOnClickListener{
            view?.findNavController()?.navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }

        binding.loginButton.setOnClickListener{
            view?.findNavController()?.navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }

        return binding.root


    }


}