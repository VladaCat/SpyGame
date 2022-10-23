package com.example.plantinmini.data.di

import com.example.spygame.presentation.view_model.main.MainViewModel
import com.example.spygame.presentation.view_model.main.MainViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModelImpl(get())
    }
}