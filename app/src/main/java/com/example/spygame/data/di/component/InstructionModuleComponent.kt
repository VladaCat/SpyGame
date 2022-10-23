package com.example.plantinmini.data.di.component

import com.example.plantinmini.data.di.navigation.navigationModule
import com.example.plantinmini.data.di.viewModelModule

object InstructionModuleComponent {

    fun getInstructionModules() = listOf(
        navigationModule,
        viewModelModule
    )
}