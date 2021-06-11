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
import com.josuemartinez.zapatosapp.databinding.ListItemsBinding
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel
import timber.log.Timber

class ListingFragment  : Fragment() {

    private val viewModel: ShoeViewModel by activityViewModels()

    private lateinit var binding: FragmentListingBinding

    private lateinit var bindingList: ListItemsBinding

    private var  shoe = Shoe()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle? ): View {
        // Inflate the layout for this fragment
        bindingList = DataBindingUtil.inflate(inflater, R.layout.list_items, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_listing, container, false)
        binding.lifecycleOwner = this

        viewModel.getLiveData().observe(viewLifecycleOwner, {
            buildShoe(it)
        })

        binding.fab.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_listingFragment_to_detailsFragment)
        }

        return binding.root
    }



    private fun filledShoe(shoe: Shoe) {
        bindingList.apply {
            textShoeName.text = shoe.name
            textShoeCompany.text = shoe.company
            textShoeSize.text = shoe.size.toString()
            textShoeDescription.text = shoe.description
        }
    }

    private fun buildShoe(shoes: List<Shoe>) {
        context?.let {
            val shoeContainer = binding.listItems
            shoes.forEach { _ ->
                val shoeLayout = bindingList.shoeItemLayout
                filledShoe(shoe)
                shoeContainer.addView(shoeLayout)
                Timber.i("Build Shoe is working")
            }
        }
    }

}


