package com.example.tokyo2020.data.domain

data class Country(
    val rank: Int,
    val team: String,
    val flagId: Int,
    val nocCode: String,
    val goldMedal: Int,
    val silverMedal: Int,
    val bronzeMedal: Int,
    val total: Int,
)