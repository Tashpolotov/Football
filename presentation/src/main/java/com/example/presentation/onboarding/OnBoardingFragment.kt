package com.example.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.example.presentation.R
import com.example.presentation.onboarding.utils.Preferences
import com.example.presentation.databinding.FragmentOnBoardingBinding
import com.example.presentation.fragment.CountriesFragment
import com.example.presentation.onboarding.model.OnBoardModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding
    @Inject lateinit var preferences: Preferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        arguments.let {
            val data = it?.getSerializable("board") as OnBoardModel
            binding.tvStazam.text = data.title
            binding.tvTitleBoard.text = data.titleText
            data.img?.let { it1 -> binding.imgBoard.setImageResource(it1) }
        }
        binding.btnGetStarted.setOnClickListener {
            val fragmentManager = requireFragmentManager()
            fragmentManager.beginTransaction().replace(R.id.fr_container, CountriesFragment())
                .commit()
            preferences.setBoardingShowed(true)
        }
    }
}