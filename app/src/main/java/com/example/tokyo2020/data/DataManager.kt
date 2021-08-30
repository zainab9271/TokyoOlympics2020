package com.example.tokyo2020.data

import com.example.tokyo2020.data.domain.Country

object DataManager {
    private val countriesList = mutableListOf<Country>()
    val countries: List<Country>
        get() = countriesList

    fun addCountry(country: Country){
        countriesList.add(country)
    }

    fun getListSize(): Int{
        return countriesList.size
    }
}