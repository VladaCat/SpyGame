package com.example.spygame.data.di.navigation

import com.example.spygame.presentation.ui.instruction.InstructionFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object InstructionScreen {
    fun instructionScreen() = FragmentScreen {
        InstructionFragment.createInstance()
    }
}