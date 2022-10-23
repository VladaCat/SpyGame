package com.example.spygame.presentation.view_model.menu

import com.example.spygame.data.di.navigation.coordinators.MainLocalCoordinator

internal class MenuViewModelImpl(private val mainLocalCoordinator: MainLocalCoordinator):MenuViewModel() {

    override fun startInstructionScreen() {
        mainLocalCoordinator.startInstructionScreen()
    }
}