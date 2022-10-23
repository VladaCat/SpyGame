package com.example.spygame.presentation.view_model.main

import com.example.spygame.data.di.navigation.coordinators.MainLocalCoordinator

internal class MainViewModelImpl(private val mainLocalCoordinator: MainLocalCoordinator): MainViewModel() {

    override fun startMenuScreen() {
        mainLocalCoordinator.startMenuScreen()
    }
}