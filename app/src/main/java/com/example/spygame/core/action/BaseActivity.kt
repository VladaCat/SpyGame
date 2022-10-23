package com.example.spygame.core.action

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.spygame.data.di.navigation.dialog_navigation.DialogNavigator
import com.github.terrakok.cicerone.NavigatorHolder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach
import org.koin.android.ext.android.inject

abstract class BaseActivity<B : ViewDataBinding>(
    @LayoutRes private val layoutId: Int
) : AppCompatActivity(), ActivityActions {
    private val navigatorHolder by inject<NavigatorHolder>()
    protected abstract val navigator: DialogNavigator
    private var viewBinding: B? = null

    protected val binding: B
        get() = viewBinding
            ?: throw IllegalStateException("Trying to access the binding outside of the view lifecycle.")

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}