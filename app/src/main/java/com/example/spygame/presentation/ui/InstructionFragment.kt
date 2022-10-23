package com.example.spygame.presentation.ui

import com.example.spygame.R
import com.example.spygame.core.action.BaseFragment
import com.example.spygame.databinding.FragmentInstructionBinding

class InstructionFragment : BaseFragment<FragmentInstructionBinding>(R.layout.fragment_instruction){
    companion object {
        fun createInstance() = InstructionFragment()
    }
}