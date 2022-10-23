package com.example.spygame.data.di.navigation.dialog_navigation

import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Router

class DialogRouter : Router() {

    fun showDialog(screen: DialogScreen) {
        executeCommands(ShowDialog(screen))
    }
}

data class ShowDialog(val screen: DialogScreen) : Command

data class CloseDialog(val screen: DialogScreen, val allowingStateLoss: Boolean = false) : Command