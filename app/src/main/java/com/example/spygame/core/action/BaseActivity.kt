package com.example.spygame.core.action

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach

abstract class BaseActivity<B : ViewDataBinding>(
    @LayoutRes private val layoutId: Int
) : AppCompatActivity(), ActivityActions {
    //private val navigatorHolder by inject<NavigatorHolder>()
    private var viewBinding: B? = null


    protected val binding: B
        get() = viewBinding
            ?: throw IllegalStateException("Trying to access the binding outside of the view lifecycle.")

    abstract fun initUI()

    open fun initCollectors() {
        // This function is meant to be overridden by an inheritor
    }

    open fun initListeners() {
        // This function is meant to be overridden by an inheritor
    }

    //TODO Remove detekt suppresses
    @Suppress("UNCHECKED_CAST", "UnusedPrivateMember", "EmptyWhenBlock")
    fun <T> observeDefaultNetworkResponse(
        flow: Flow<T>,
        successAction: ((T) -> Unit)? = null,
        onFailure: (() -> Unit)? = null,
        onLoading: ((Boolean) -> Unit)? = null,
        isDefaultLoadingEnable: Boolean = true
    ) {
        flow.onEach { data ->
            when (data) {
                //TODO Set-up network results callbacks
            }
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        //navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
       //navigatorHolder.removeNavigator()
        super.onPause()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, layoutId)
        initUI()
        //TODO Check this logic
//        if (savedInstanceState == null) {
//            startFirstScreen()
//        }
        initListeners()
        initCollectors()
    }

    override fun onDestroy() {
        viewBinding = null
        super.onDestroy()
    }

    override fun onBackPressed() {
//        val fragment = supportFragmentManager.findFragmentById(navigator.containerLayoutId)
//        if (fragment != null && fragment is BackButtonListener &&
//            (fragment as BackButtonListener).onBackPressed()
//        ) {
//            return
//        } else {
//            super.onBackPressed()
//        }
    }
}