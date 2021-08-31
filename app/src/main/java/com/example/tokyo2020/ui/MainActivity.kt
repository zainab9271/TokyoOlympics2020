package com.example.tokyo2020.ui

import android.view.LayoutInflater
import android.widget.Toast
import com.example.tokyo2020.data.DataManager
import com.example.tokyo2020.databinding.ActivityMainBinding
import com.example.tokyo2020.util.CsvParser

class MainActivity : BaseActivity<ActivityMainBinding>(), CountryActionsListener {
    override val LOG_TAG: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun setup() {
        val inputStream = assets.open("tokyo2020.csv")
        CsvParser(this).prepareData(inputStream)
        log("Data size = ${DataManager.countries.size}")
        val adapter = CountryAdapter(DataManager.countries, this)
        binding.recyclerCountry.adapter = adapter
    }

    override fun addCallBacks() {

    }

    override fun onClickFlag(teamName: String) {
        Toast.makeText(this, teamName, Toast.LENGTH_SHORT).show()
    }


}