package com.example.tokyo2020.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.tokyo2020.R

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    abstract val LOG_TAG: String
    abstract val bindingInflater: (LayoutInflater) -> VB
    private lateinit var _binding: VB
    protected val binding: VB
        get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Tokyo2020)
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(_binding.root)
        setup()
        addCallBacks()
    }

    abstract fun setup()

    abstract fun addCallBacks()

    protected fun log(value: Any) {
        Log.v(LOG_TAG, value.toString())
    }
}