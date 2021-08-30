package com.example.tokyo2020.ui

import android.view.LayoutInflater
import android.widget.Toast
import com.example.tokyo2020.data.DataManager
import com.example.tokyo2020.databinding.ActivityMainBinding
import com.example.tokyo2020.util.CsvParser

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun setup() {
        val inputStream = assets.open("tokyo2020.csv")
        CsvParser(this).prepareData(inputStream)
        log("Data size = ${DataManager.getListSize()}")
    }

    override fun addCallBacks() {
        binding.text1.setOnClickListener {
            Toast.makeText(this, binding.text1.text, Toast.LENGTH_SHORT).show()
        }
    }


}