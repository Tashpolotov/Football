package com.example.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.domain.model.ClubName
import com.example.presentation.R
import com.example.presentation.adapter.FootballClubAdapter
import com.example.presentation.databinding.FragmentFootballClubsBinding
import com.example.presentation.viewmodel.CountryViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FootballClubsFragment : Fragment() {

    private lateinit var binding: FragmentFootballClubsBinding
    private val viewModel by viewModels<CountryViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFootballClubsBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        loadClubsForSelectedCountry()
    }

    private fun initAdapter() {
        val adapter = FootballClubAdapter {
            onItemClick(it)
        }
        binding.rvCountry.adapter = adapter
        lifecycleScope.launchWhenCreated {
            viewModel.state.collect {
                adapter.submitList(it.clubs)
            }
        }
    }

    private fun loadClubsForSelectedCountry() {
        val selectedCountry = arguments?.getString("selected_country")
        selectedCountry?.let {
            lifecycleScope.launch {
                viewModel.loadClubsForCountry(it)
            }
        }
    }

    private fun onItemClick(club: ClubName) {
        val clubDetailsFragment = ClubDetailsFragment()
        val args = Bundle()
        args.putString("selected_club", club.name)
        clubDetailsFragment.arguments = args
        parentFragmentManager.beginTransaction()
            .replace(R.id.fr_container, clubDetailsFragment)
            .addToBackStack(null)
            .commit()
    }
}