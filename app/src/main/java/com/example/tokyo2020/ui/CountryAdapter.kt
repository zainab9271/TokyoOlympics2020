package com.example.tokyo2020.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyo2020.R
import com.example.tokyo2020.data.domain.Country
import com.example.tokyo2020.ui.viewHolders.CountryViewHolder

class CountryAdapter(val list: List<Country>): RecyclerView.Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentCountry = list[position]
        holder.apply {
            textCountryRank.text = currentCountry.rank.toString()
            imageCountryFlag.setImageResource(currentCountry.flagId)
            textCountryCode.text = currentCountry.nocCode
            textCountryGolds.text = currentCountry.goldMedal.toString()
            textCountrySilvers.text = currentCountry.silverMedal.toString()
            textCountryBronzes.text = currentCountry.bronzeMedal.toString()
            textCountryTotal.text = currentCountry.total.toString()
        }
    }

    override fun getItemCount() = list.size
}