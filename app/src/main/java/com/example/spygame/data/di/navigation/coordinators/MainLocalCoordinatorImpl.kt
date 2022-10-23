package com.example.spygame.data.di.navigation.coordinators

import com.example.spygame.data.di.navigation.InstructionScreen
import com.example.spygame.data.di.navigation.MenuScreen
import com.example.spygame.data.di.navigation.dialog_navigation.DialogRouter

class MainLocalCoordinatorImpl(private val router: DialogRouter):MainLocalCoordinator {
    override fun startInstructionScreen() {
        router.newRootScreen(InstructionScreen.instructionScreen())
    }

    override fun startMenuScreen() {
        router.newRootScreen(MenuScreen.menuScreen())
    }
}