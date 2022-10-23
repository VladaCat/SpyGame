package com.example.spygame.data.di.navigation

import com.example.spygame.presentation.ui.MainMenuFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object MenuScreen {
    fun menuScreen() = FragmentScreen {
        MainMenuFragment.createInstance()
    }
}