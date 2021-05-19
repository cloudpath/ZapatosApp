package com.josuemartinez.zapatosapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.josuemartinez.zapatosapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val _binding get() = binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.login.setOnClickListener {
            requireActivity().run {
                startActivity(Intent(this, MainActivity::class.java))
                finish() // If activity no more needed in back stack
            }
        }
        return binding.root


    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

}