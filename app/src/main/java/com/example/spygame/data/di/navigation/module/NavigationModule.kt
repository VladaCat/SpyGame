package com.example.plantinmini.data.di.navigation

import com.example.spygame.data.di.navigation.coordinators.MainLocalCoordinator
import com.example.spygame.data.di.navigation.coordinators.MainLocalCoordinatorImpl
import com.example.spygame.data.di.navigation.dialog_navigation.DialogRouter
import com.github.terrakok.cicerone.Cicerone
import org.koin.dsl.module

internal val navigationModule = module {

    val cicerone = Cicerone.create(DialogRouter())

    single { cicerone.router }
    single { cicerone.getNavigatorHolder() }

    factory<MainLocalCoordinator> { MainLocalCoordinatorImpl(get()) }
}
