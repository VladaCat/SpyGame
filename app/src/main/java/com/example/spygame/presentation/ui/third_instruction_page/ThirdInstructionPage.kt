package com.example.spygame.presentation.ui.third_instruction_page


import androidx.databinding.ViewDataBinding
import com.example.spygame.R
import com.example.spygame.core.action.BaseFragment
import com.example.spygame.core.action.BaseViewModel
import com.example.spygame.databinding.FragmentThirdInstructionPageBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ThirdInstructionPage: BaseFragment<FragmentThirdInstructionPageBinding>(R.layout.fragment_third_instruction_page){
    private val viewModel by viewModel<ThirdInstructionPageViewModel>()

    companion object{
        fun createInstance() = ThirdInstructionPage()
    }
}
