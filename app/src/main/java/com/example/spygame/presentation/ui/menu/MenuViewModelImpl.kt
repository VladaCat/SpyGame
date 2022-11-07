package com.example.spygame.presentation.ui.menu

import com.example.spygame.presentation.navigation.AppCoordinator

internal class MenuViewModelImpl(
    private val appCoordinator: AppCoordinator
) : MainMenuViewModel() {
    override fun startInstructionScreen() {
        appCoordinator.startInstructionsScreen()
    }
}