package com.example.spygame.di.modules

import com.example.spygame.presentation.navigation.AppCoordinator
import com.example.spygame.presentation.navigation.dialog_navigator.DialogRouter
import com.github.terrakok.cicerone.Cicerone
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val navigationModule = module {
    val cicerone = Cicerone.create(DialogRouter())

    single { cicerone.router }
    single { cicerone.getNavigatorHolder() }
    factoryOf(::AppCoordinator)
}
