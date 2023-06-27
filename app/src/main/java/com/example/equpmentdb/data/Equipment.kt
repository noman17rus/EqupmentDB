package com.example.equpmentdb.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Equipment(
    @PrimaryKey(autoGenerate = false)
    val name: String,
    @ColumnInfo
    val dataStart: String,
    @ColumnInfo
    val dateEnd: String,
    @ColumnInfo
    val period: Int,
    @ColumnInfo
    val daysLeft: Int
) {
}