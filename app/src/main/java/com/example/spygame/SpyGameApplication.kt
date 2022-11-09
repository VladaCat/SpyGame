package com.example.spygame

import android.app.Application
import com.example.spygame.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin


internal class SpyGameApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        configureDi()
    }

    private fun configureDi() {
        startKoin {
            androidContext(androidContext = this@SpyGameApplication)
            androidLogger()
            modules(
                provideComponent()
            )
        }
    }

    private fun provideComponent() = appComponent
}