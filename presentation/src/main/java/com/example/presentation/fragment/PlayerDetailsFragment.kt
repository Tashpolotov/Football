package com.example.presentation.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.presentation.adapter.PlayerDetailAdapter
import com.example.presentation.databinding.FragmentPlayerDetailsBinding
import com.example.presentation.viewmodel.CountryViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PlayerDetailsFragment : Fragment() {

    private lateinit var binding: FragmentPlayerDetailsBinding
    private val viewModel by viewModels<CountryViewModel>()
    private val adapter = PlayerDetailAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentPlayerDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        loadPlayerDetail()
        initView()
    }

    private fun initView() {
        binding.btnSend.setOnClickListener{
            val playerInfo = adapter.currentList.firstOrNull()
            if (playerInfo != null) {
                val message = "Имя: ${playerInfo.name}\n" +
                        "Страна: ${playerInfo.country}\n" +
                        "Позиция: ${playerInfo.position}\n" +
                        "Количество голов: ${playerInfo.goal}\n" +
                        "Количество матчей: ${playerInfo.game}\n"

                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, message)
                    type = "text/plain"
                }
                val shareIntent = Intent.createChooser(sendIntent, "Отправить участника через...")
                startActivity(shareIntent)
            }
        }
    }

    private fun initAdapter() {
        binding.rvCountry.adapter = adapter
        lifecycleScope.launchWhenCreated {
            viewModel.state.collect{
                adapter.submitList(it.playerDetail)
            }
        }
    }
    private fun loadPlayerDetail() {
        val selectedPlayer = arguments?.getString("selected_player")
        selectedPlayer?.let {
            lifecycleScope.launch {
                viewModel.loadPlayerDetail(it)
            }
        }
    }
}