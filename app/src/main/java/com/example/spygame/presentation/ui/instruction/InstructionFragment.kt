package com.example.spygame.presentation.ui.instruction

import androidx.navigation.findNavController
import com.example.spygame.R
import com.example.spygame.core.action.BaseFragment
import com.example.spygame.databinding.FragmentInstructionBinding
import com.example.spygame.presentation.ui.first_instruction_page.FirstInstructionPage
import com.example.spygame.presentation.ui.second_instruction_page.SecondInstructionPage
import com.example.spygame.presentation.ui.third_instruction_page.ThirdInstructionPage
import com.example.spygame.rules.VpAdapter
import com.google.android.material.tabs.TabLayoutMediator
import org.koin.androidx.viewmodel.ext.android.viewModel

class InstructionFragment :
    BaseFragment<FragmentInstructionBinding>(R.layout.fragment_instruction) {

    private val viewModel by viewModel<InstructionViewModel>()


    private val fragList = listOf(
        FirstInstructionPage.createInstance(),
        SecondInstructionPage.createInstance(),
        ThirdInstructionPage.createInstance()
    )

    override fun initUI() {
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = VpAdapter(this, fragList)

        with(binding) {
            vpRules.adapter = adapter
            TabLayoutMediator(tbLayout, vpRules) { tab, pos -> }.attach()
        }
    }

    companion object {
        fun createInstance() = InstructionFragment()
    }
}