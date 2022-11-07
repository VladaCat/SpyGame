package com.example.spygame.presentation.ui.menu

import com.example.spygame.R
import com.example.spygame.core.action.BaseFragment
import com.example.spygame.databinding.FragmentMainMenuBinding
import com.example.spygame.presentation.ui.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainMenuFragment : BaseFragment<FragmentMainMenuBinding>(R.layout.fragment_main_menu) {
    private val viewModel by viewModel<MainMenuViewModel>()

    override fun initListeners() {
        binding.btnRules.setOnClickListener {
            viewModel.startInstructionScreen()
        }
    }
    companion object {
        fun createInstance() = MainMenuFragment()
    }
}