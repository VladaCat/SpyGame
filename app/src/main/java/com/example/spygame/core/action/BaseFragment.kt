package com.example.spygame.core.action

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay

@Suppress("TooManyFunctions")
abstract class BaseFragment<B : ViewDataBinding>(private val layoutId: Int) : Fragment() {
    protected open val binding: B
        get() = viewBinding
            ?: throw IllegalStateException("Trying to access the binding outside of the view lifecycle.")

    private var viewBinding: B? = null
    private var activityActions: ActivityActions? = null

    private var isFirstOpen = true
    private var isNavigateActionMade = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        savedInstanceState?.clear()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activityActions = requireActivity() as? ActivityActions
        initHideKeyboardListener(binding.root)
        initUI()
        initListeners()
        if (isFirstOpen) {
            initOneTimeCollectors()
        }
        initCollectors()
        isFirstOpen = false
    }

    override fun onDestroyView() {
        viewBinding = null
        super.onDestroyView()
    }

    open fun initUI() {
        // This function is meant to be overridden by an inheritor
    }

    open fun initListeners() {
        // This function is meant to be overridden by an inheritor
    }

    open fun initOneTimeCollectors() {
        // This function is meant to be overridden by an inheritor
    }

    open fun initCollectors() {
        // This function is meant to be overridden by an inheritor
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun initHideKeyboardListener(view: View) {
        view.setOnTouchListener { _, _ ->
            return@setOnTouchListener false
        }
    }

    protected fun showProgressDialog(isLoading: Boolean) {
        activityActions?.showProgressDialog(isLoading)
    }

    protected fun showProgressDialogForTime(time: Long = 1000) {
        showProgressDialog(true)
        lifecycleScope.launchWhenStarted {
            delay(time)
            showProgressDialog(false)
        }
    }
}