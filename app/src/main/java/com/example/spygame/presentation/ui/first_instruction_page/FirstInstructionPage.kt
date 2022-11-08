package com.example.spygame.presentation.ui.first_instruction_page

import androidx.databinding.ViewDataBinding
import com.example.spygame.R
import com.example.spygame.core.action.BaseFragment
import com.example.spygame.databinding.FragmentFirstInstructionPageBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstInstructionPage :
    BaseFragment<FragmentFirstInstructionPageBinding>(R.layout.fragment_first_instruction_page) {
    private val viewModel by viewModel<FirstInstructionPageViewModel>()

    companion object {
        fun createInstance() = FirstInstructionPage()
    }
}