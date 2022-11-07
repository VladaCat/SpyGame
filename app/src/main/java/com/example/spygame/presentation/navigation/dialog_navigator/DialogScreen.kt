package com.example.spygame.presentation.navigation.dialog_navigator

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.Creator
import com.github.terrakok.cicerone.androidx.FragmentScreen

open class DialogScreen constructor(
    private val dialogCreator: Creator<FragmentFactory, DialogFragment>
) : FragmentScreen {
    fun createDialog(factory: FragmentFactory) = dialogCreator.create(factory)

    override fun createFragment(factory: FragmentFactory): Fragment {
        return dialogCreator.create(factory)
    }
}
