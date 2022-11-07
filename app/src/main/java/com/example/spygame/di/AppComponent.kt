package com.example.spygame.di

import com.example.spygame.di.modules.navigationModule
import com.example.spygame.di.modules.viewModelModule

val appComponent = mutableListOf(
    navigationModule,
    viewModelModule
)