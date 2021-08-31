package com.example.tokyo2020.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyo2020.R
import com.example.tokyo2020.data.domain.Country
import com.example.tokyo2020.databinding.ItemCountryBinding

class CountryAdapter(private val list: List<Country>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentCountry = list[position]
        holder.binding.apply {
            textRank.text = currentCountry.rank.toString()
            imageFlag.setImageResource(currentCountry.flagId)
            textNoc.text = currentCountry.nocCode
            textGoldMedals.text = currentCountry.goldMedal.toString()
            textSilverMedals.text = currentCountry.silverMedal.toString()
            textBronzeMedals.text = currentCountry.bronzeMedal.toString()
            textTotal.text = currentCountry.total.toString()
        }
    }

    override fun getItemCount() = list.size

    class CountryViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
        val binding = ItemCountryBinding.bind(viewItem)
    }
}