package com.example.spygame.presentation.ui.second_instruction_page


import androidx.databinding.ViewDataBinding
import com.example.spygame.R
import com.example.spygame.core.action.BaseFragment
import com.example.spygame.databinding.FragmentSecondInstructionPageBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondInstructionPage :
    BaseFragment<FragmentSecondInstructionPageBinding>(R.layout.fragment_second_instruction_page) {
    private val viewModel by viewModel<SecondInstructionPageViewModel>()

    companion object {
        fun createInstance() = SecondInstructionPage()
    }
}