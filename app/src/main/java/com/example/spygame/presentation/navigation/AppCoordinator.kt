package com.example.spygame.presentation.navigation

import com.example.spygame.presentation.navigation.dialog_navigator.DialogRouter
import com.example.spygame.presentation.ui.instruction.InstructionFragment
import com.example.spygame.presentation.ui.menu.MainMenuFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class AppCoordinator(private val router: DialogRouter) {
    fun startMainMenuScreen() {
        router.newRootScreen(FragmentScreen { MainMenuFragment.createInstance() })
    }

    fun startInstructionsScreen() {
        router.navigateTo(FragmentScreen { InstructionFragment.createInstance() })
    }
}