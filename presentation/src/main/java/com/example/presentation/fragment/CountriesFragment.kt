package com.example.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.domain.model.CountryModel
import com.example.presentation.R
import com.example.presentation.adapter.CountryAdapter
import com.example.presentation.databinding.FragmentCountriesBinding
import com.example.presentation.viewmodel.CountryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CountriesFragment : Fragment() {

    private lateinit var binding: FragmentCountriesBinding
    private val viewModel by viewModels<CountryViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCountriesBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = CountryAdapter {
            onItemClick(it)
        }
        binding.rvCountry.adapter = adapter
        lifecycleScope.launchWhenCreated {
            viewModel.state.collect { country ->
                adapter.submitList(country.country)
            }
        }
        viewModel.loadCountry()
    }

    private fun onItemClick(country: CountryModel) {
        val footballClubsFragment = FootballClubsFragment()
        val args = Bundle()
        args.putString("selected_country", country.country)
        footballClubsFragment.arguments = args
        parentFragmentManager.beginTransaction()
            .replace(R.id.fr_container, footballClubsFragment)
            .addToBackStack(null)
            .commit()
    }
}