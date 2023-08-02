package com.example.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.domain.model.ClubDetailModel
import com.example.presentation.R
import com.example.presentation.adapter.ClubsInfoAdapter
import com.example.presentation.databinding.FragmentClubDetailsBinding
import com.example.presentation.viewmodel.CountryViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ClubDetailsFragment : Fragment() {

    private lateinit var binding: FragmentClubDetailsBinding
    private val viewModel by viewModels<CountryViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentClubDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        loadClubsCountry()
        val snackbarMessage = "Нажмите на число игроков, чтобы увидеть информацию о всех игроках"
        Snackbar.make(view, snackbarMessage, Snackbar.LENGTH_LONG).show()
    }

    private fun initAdapter() {
        val adapter = ClubsInfoAdapter { country ->
            onItemClick(country)
        }
        binding.rvCountry.adapter = adapter
        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            viewModel.state.collect {
                adapter.submitList(it.infoClubs)
            }
        }
    }

    private fun loadClubsCountry() {
        val selectedClub = arguments?.getString("selected_club")
        selectedClub?.let {
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.loadInfoClubs(it)
            }
        }
    }
    private fun onItemClick(clubInfo: ClubDetailModel) {
        val PlayersFragment = PlayersFragment()
        val args = Bundle()
        args.putString("selected_player", clubInfo.name)
        PlayersFragment.arguments = args
        parentFragmentManager.beginTransaction()
            .replace(R.id.fr_container, PlayersFragment)
            .addToBackStack(null)
            .commit()
    }
}