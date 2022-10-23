package com.example.plantinmini.data.di

import com.example.plantinmini.data.di.component.MenuModuleComponent
import com.example.plantinmini.data.di.component.InstructionModuleComponent

val appComponent = mutableListOf(
    appModule
).apply {
    addAll(MenuModuleComponent.getMenuModule())
    addAll(InstructionModuleComponent.getInstructionModules())
}