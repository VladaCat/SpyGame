package com.example.spygame.presentation.ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.example.spygame.R
import com.example.spygame.core.action.BaseActivity
import com.example.spygame.data.di.navigation.dialog_navigation.DialogNavigator
import com.example.spygame.databinding.ActivityMainBinding
import com.example.spygame.presentation.view_model.main.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val viewModel by viewModel<MainViewModel>()
    override val navigator: DialogNavigator
        get() = DialogNavigator(this, R.id.fcMain)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.startMenuScreen()
    }

    override fun showProgressDialog(isVisible: Boolean) {
        TODO("Not yet implemented")
    }

    override fun showBottomNavigation(isVisible: Boolean) {
        TODO("Not yet implemented")
    }

    override fun hideKeyboard() {
        val inputManager =
            this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }
}