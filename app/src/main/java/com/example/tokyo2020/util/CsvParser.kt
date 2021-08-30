package com.example.tokyo2020.util

import android.content.Context
import com.example.tokyo2020.data.DataManager
import com.example.tokyo2020.data.domain.Country
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class CsvParser(private val context: Context) {
    fun prepareData(inputStream: InputStream){
        val buffer = BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine { DataManager.addCountry(parse(it)) }
    }

    private fun parse(line: String): Country {
        val tokens = line.split(",")
        val countryCode = tokens[Constants.DataColumnIndex.NOC_CODE].lowercase()
        return Country(
            rank = tokens[Constants.DataColumnIndex.RANK].toInt(),
            nocCode = tokens[Constants.DataColumnIndex.NOC_CODE],
            goldMedal = tokens[Constants.DataColumnIndex.GOLD_MEDAL].toInt(),
            silverMedal = tokens[Constants.DataColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal = tokens[Constants.DataColumnIndex.BRONZE_MEDAL].toInt(),
            total = tokens[Constants.DataColumnIndex.TOTAL].toInt(),
            flagId = context.resources.getIdentifier(countryCode, "drawable", context.packageName)
        )
    }
}