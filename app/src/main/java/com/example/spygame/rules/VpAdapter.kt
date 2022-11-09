package com.example.spygame.rules

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.spygame.presentation.ui.instruction.InstructionFragment

class VpAdapter(fa: InstructionFragment, private val list: List<Fragment>): FragmentStateAdapter(fa){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}