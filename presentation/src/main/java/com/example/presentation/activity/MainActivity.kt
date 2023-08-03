package com.example.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.presentation.R
import com.example.presentation.databinding.ActivityMainBinding
import com.example.presentation.fragment.CountriesFragment
import com.example.presentation.onboarding.OnPageFragment
import com.example.presentation.onboarding.utils.Preferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var preferences: Preferences

    private lateinit var onBoardingCompletedKey: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onBoardingCompletedKey = "onBoardingCompleted"
        preferences.setBoardingShowed(false)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            if (!preferences.isBoardingShowed()) {
                supportFragmentManager.beginTransaction().add(R.id.fr_container, OnPageFragment()).commit()
            } else {
                supportFragmentManager.beginTransaction().add(R.id.fr_container, CountriesFragment()).commit()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean(onBoardingCompletedKey, preferences.isBoardingShowed())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        preferences.setBoardingShowed(savedInstanceState.getBoolean(onBoardingCompletedKey, false))
    }
}