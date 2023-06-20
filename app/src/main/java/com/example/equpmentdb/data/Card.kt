package com.example.equpmentdb.data

import java.time.LocalDate

data class Card(
    val name: String,
    val dataStart: LocalDate?,
    val dateEnd: LocalDate?,
    val period: Int,
    val daysLeft: Int
) {
}