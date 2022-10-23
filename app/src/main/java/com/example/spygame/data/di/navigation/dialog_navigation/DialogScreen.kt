package com.example.spygame.data.di.navigation.dialog_navigation

import android.util.Log
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.Creator
import com.github.terrakok.cicerone.androidx.FragmentScreen

class DialogScreen constructor(
    private val dialogCreator: Creator<FragmentFactory, DialogFragment>
) : FragmentScreen {
    init {
        Log.d("init", "DialogScreen")
    }

    fun createDialog(factory: FragmentFactory) = dialogCreator.create(factory)

    override fun createFragment(factory: FragmentFactory): Fragment {
        Log.d("init", "create")

        return dialogCreator.create(factory)
    }
}