package com.example.spygame.presentation.ui

import com.example.spygame.presentation.navigation.AppCoordinator

internal class MainViewModelImpl(private val appCoordinator: AppCoordinator) : MainViewModel() {

    override fun startMenuScreen() {
        appCoordinator.startMainMenuScreen()
    }
}