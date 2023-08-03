package com.example.presentation.onboarding

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.presentation.R
import com.example.presentation.onboarding.model.OnBoardModel
import dagger.hilt.android.qualifiers.ApplicationContext

class OnBoardAdapter(@ApplicationContext fragment: FragmentActivity): FragmentStateAdapter(fragment) {

    private val listBoarding = arrayOf(
        OnBoardModel(
            "Приложение о футболле",
            R.drawable.football,
            "Добро пожаловать в наше приложение"
        ),
        OnBoardModel(
            "Здесь вы можете найти всю информацию о командах выбрав страну ",
            R.drawable.footbaall1,
            "",
        ),
        OnBoardModel(
            "А также всю информаци о любимых ваших игроках",
            R.drawable.fottball3,
            "и информация о всех клубах",
        )
    )
    override fun getItemCount(): Int = listBoarding.size

    override fun createFragment(position: Int): Fragment {
        val data = bundleOf("board" to listBoarding[position])
        val fragment = OnBoardingFragment()
        fragment.arguments = data
        return fragment
    }
}