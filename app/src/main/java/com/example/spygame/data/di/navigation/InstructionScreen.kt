package com.example.spygame.data.di.navigation

import com.example.spygame.presentation.ui.InstructionFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object InstructionScreen {
    fun instructionScreen() = FragmentScreen {
        InstructionFragment.createInstance()
    }
}