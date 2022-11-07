package com.example.spygame.di.modules

import com.example.spygame.presentation.ui.instruction.InstructionViewModel
import com.example.spygame.presentation.ui.instruction.InstructionViewModelImpl
import com.example.spygame.presentation.ui.MainViewModel
import com.example.spygame.presentation.ui.MainViewModelImpl
import com.example.spygame.presentation.ui.menu.MainMenuViewModel
import com.example.spygame.presentation.ui.menu.MenuViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val viewModelModule = module {
    viewModel<MainViewModel> { MainViewModelImpl(get()) }
    viewModel<MainMenuViewModel> { MenuViewModelImpl(get()) }
    viewModel<InstructionViewModel> { InstructionViewModelImpl() }
}