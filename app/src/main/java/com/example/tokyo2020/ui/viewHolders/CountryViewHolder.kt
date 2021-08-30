package com.example.tokyo2020.ui.viewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyo2020.R

class CountryViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
    val textCountryRank: TextView = viewItem.findViewById(R.id.text_rank)
    val imageCountryFlag: ImageView = viewItem.findViewById(R.id.image_flag)
    val textCountryCode: TextView = viewItem.findViewById(R.id.text_noc)
    val textCountryGolds: TextView = viewItem.findViewById(R.id.text_gold_medals)
    val textCountrySilvers: TextView = viewItem.findViewById(R.id.text_silver_medals)
    val textCountryBronzes: TextView = viewItem.findViewById(R.id.text_bronze_medals)
    val textCountryTotal: TextView = viewItem.findViewById(R.id.text_total)
}