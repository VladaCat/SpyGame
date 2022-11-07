package com.example.spygame.presentation.navigation.dialog_navigator

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.FragmentManager
import com.github.terrakok.cicerone.Command
import com.example.spygame.presentation.navigation.base.CoreNavigator

open class DialogNavigator(
    activity: FragmentActivity,
    containerId: Int,
    fragmentManager: FragmentManager = activity.supportFragmentManager,
    fragmentFactory: FragmentFactory = fragmentManager.fragmentFactory
) :
    CoreNavigator(activity, containerId, fragmentManager, fragmentFactory) {

    override fun applyCommand(command: Command) {
        when (command) {
            is CloseDialog -> closeDialog(command)
            is ShowDialog -> showDialog(command)
            else -> super.applyCommand(command)
        }
    }

    protected open fun showDialog(command: ShowDialog) {
        val tag = command.screen.screenKey
        val dialog = command.screen.createDialog(fragmentFactory)
        dialog.show(fragmentManager, tag)
    }

    protected open fun closeDialog(command: CloseDialog) {
        val tag = command.screen.screenKey
        val dialog = fragmentManager.findFragmentByTag(tag)
        if (dialog is DialogFragment)
            if (command.allowingStateLoss) {
                dialog.dismissAllowingStateLoss()
            } else {
                dialog.dismiss()
            }
    }
}
