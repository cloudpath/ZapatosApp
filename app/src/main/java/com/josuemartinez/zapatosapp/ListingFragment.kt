package com.josuemartinez.zapatosapp

import android.content.ClipData
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.josuemartinez.zapatosapp.databinding.FragmentDetailsBinding
import com.josuemartinez.zapatosapp.databinding.FragmentListingBinding
import com.josuemartinez.zapatosapp.databinding.ListItemsBinding
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel
import java.util.Observer

class ListingFragment  : Fragment() {

    private val viewModel: ShoeViewModel by activityViewModels()

    private lateinit var binding: FragmentListingBinding

    private lateinit var bindingList: ListItemsBinding

    private var  shoe = Shoe()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle? ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_listing, container, false)
        bindingList = DataBindingUtil.inflate(inflater, R.layout.list_items, container, false)


        viewModel.getLiveData().observe(viewLifecycleOwner, {
            bindingList.apply {
                shoeNameHint.text = shoe.name
                shoeSizeHint.text = shoe.size.toString()
                shoeCompanyHint.text = shoe.company
                shoeDescriptionHint.text = shoe.description
            }
        })
        


        binding.fab.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_listingFragment_to_detailsFragment)
        }


        return binding.root
    }

    private fun buildShoe(shoes: List<Shoe>) {

    }


//    fun loadShoe(shoe: Shoe) {
//        bindingList.apply {
//            shoeNameHint.text = shoe.name
//            shoeSizeHint.text = shoe.size.toString()
//            shoeCompanyHint.text = shoe.company
//            shoeDescriptionHint.text = shoe.description
//        }
//    }

}
