package com.example.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.domain.model.Players
import com.example.presentation.R
import com.example.presentation.adapter.PlayersAdapter
import com.example.presentation.databinding.FragmentPlayersBinding
import com.example.presentation.viewmodel.CountryViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PlayersFragment : Fragment() {

    private lateinit var binding: FragmentPlayersBinding
    private val viewModel by viewModels<CountryViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentPlayersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        loadPlayers()
    }

    private fun initAdapter() {
        val adapter = PlayersAdapter{
            onItemClick(it)
        }
        binding.rvCountry.adapter = adapter
        lifecycleScope.launchWhenCreated {
            viewModel.state.collect{
                adapter.submitList(it.players)
            }
        }
    }
    private fun loadPlayers() {
        val selectedPlayers = arguments?.getString("selected_player")
        selectedPlayers?.let {
            lifecycleScope.launch{
                viewModel.loadPlayers(it)
            }
        }
    }

    private fun onItemClick(model: Players) {
        val fragment = PlayerDetailsFragment()
        val args = Bundle()
        args.putString("selected_player", model.name)
        fragment.arguments = args
        parentFragmentManager.beginTransaction()
            .replace(R.id.fr_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}