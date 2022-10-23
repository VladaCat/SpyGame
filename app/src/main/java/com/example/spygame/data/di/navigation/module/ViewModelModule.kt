package com.example.plantinmini.data.di

import com.example.spygame.presentation.view_model.menu.MenuViewModel
import com.example.spygame.presentation.view_model.menu.MenuViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val viewModelModule = module {
    viewModel<MenuViewModel> { MenuViewModelImpl(get()) }
}