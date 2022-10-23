package com.example.spygame.data.di.navigation.dialog_navigation

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.FragmentManager
import com.example.spygame.core.util.CoreNavigator
import com.github.terrakok.cicerone.Command

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