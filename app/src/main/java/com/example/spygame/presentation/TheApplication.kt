package com.example.spygame.presentation

import android.app.Application
import com.example.plantinmini.data.di.appComponent
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin


internal class TheApplication : Application() {
    private var cicerone: Cicerone<Router>? = null

    override fun onCreate() {
        super.onCreate()
        configureDi()
        appInstance = this
        cicerone = Cicerone.create()
    }

    fun getNavigatorHolder(): NavigatorHolder? {
        return cicerone!!.getNavigatorHolder()
    }

    fun getRouter(): Router? {
        return cicerone!!.router
    }

    private fun configureDi() {
        startKoin {
            androidContext(androidContext = this@TheApplication)
            androidLogger()
            modules(
                provideComponent()
            )
        }
    }

    private fun provideComponent() = appComponent

    companion object {
        var appInstance: TheApplication? = null
    }
}