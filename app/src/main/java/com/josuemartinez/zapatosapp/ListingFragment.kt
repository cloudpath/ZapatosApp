package com.josuemartinez.zapatosapp

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.josuemartinez.zapatosapp.databinding.FragmentListingBinding
import com.josuemartinez.zapatosapp.databinding.FragmentLoginBinding
import com.josuemartinez.zapatosapp.models.Shoe
import com.josuemartinez.zapatosapp.viewmodels.ShoeViewModel
import timber.log.Timber


class ListingFragment  : Fragment() {

    private val viewModel: ShoeViewModel by activityViewModels()

    private lateinit var binding: FragmentListingBinding

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle? ): View {
        // Inflate the layout for this fragment

        binding = FragmentListingBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = this

        viewModel.getShoeData().observe(viewLifecycleOwner, {
            if (it.isNotEmpty()) {
                buildShoe(it)
            }
        })

        binding.fab.setOnClickListener {
            view?.findNavController()?.navigate(ListingFragmentDirections.actionListingFragmentToDetailsFragment())
        }


        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController()
        // Associate the menu items on menu.xml with destinations name
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
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















