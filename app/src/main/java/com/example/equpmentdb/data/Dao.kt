package com.example.equpmentdb.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {
    @Query("SELECT * FROM Equipment")
    fun getEquipment(): List<Equipment>
    @Insert
    fun addEquipment(equipment: Equipment)
    @Delete
    fun deleteEquipment(equipment: Equipment)
}