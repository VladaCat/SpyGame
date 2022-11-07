package com.example.spygame.presentation.navigation.base

import com.github.terrakok.cicerone.Router

abstract class CoreCoordinator {

    protected abstract val router: Router

    fun back() {
        router.exit()
    }
}
