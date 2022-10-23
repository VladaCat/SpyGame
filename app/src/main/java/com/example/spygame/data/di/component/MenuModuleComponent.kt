package com.example.plantinmini.data.di.component

import com.example.plantinmini.data.di.navigation.navigationModule
import com.example.plantinmini.data.di.viewModelModule

object MenuModuleComponent {
    fun getMenuModule() = listOf(
        navigationModule,
        viewModelModule
    )
}