package com.example.spygame.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.spygame.R
import com.example.spygame.core.action.BaseFragment
import com.example.spygame.databinding.FragmentInstructionBinding
import com.example.spygame.databinding.FragmentMainMenuBinding
import com.example.spygame.presentation.view_model.main.MainViewModel
import com.example.spygame.presentation.view_model.menu.MenuViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainMenuFragment : BaseFragment<FragmentMainMenuBinding>(R.layout.fragment_main_menu) {
    private val viewModel by viewModel<MenuViewModel>()

    override fun initListeners() {
        binding.btRules.setOnClickListener {
            viewModel.startInstructionScreen()
        }
    }
    companion object {
        fun createInstance() = MainMenuFragment()
    }
}