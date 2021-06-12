package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentListingBinding
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel
import timber.log.Timber


class ListingFragment  : Fragment() {

    private val viewModel: ShoeViewModel by activityViewModels()

    private lateinit var binding: FragmentListingBinding

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle? ): View {
        // Inflate the layout for this fragment
//
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_listing, container, false)
        binding.lifecycleOwner = this

        viewModel.getShoeData().observe(viewLifecycleOwner, {
            if (it.isNotEmpty()) {
                buildShoe(it)
            }
        })

        binding.fab.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_listingFragment_to_detailsFragment)
        }

        return binding.root
    }


    private fun buildShoe(shoes: List<Shoe>) {
        context?.let { context ->
            val shoeContainer = binding.listItems
            shoes.forEach { shoe ->
                val shoeLayout = ItemsList(context)
                shoeLayout.filledShoe(shoe)
                    // https://developer.android.com/reference/android/view/ViewGroup
                    shoeContainer.addView(
                        shoeLayout
                    )
                }
                Timber.i("Build Shoe is working")
        }
    }
    


}















