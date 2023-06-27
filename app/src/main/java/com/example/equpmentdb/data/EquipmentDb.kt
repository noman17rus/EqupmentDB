package com.example.equpmentdb.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Equipment::class], version = 1)
abstract class EquipmentDb: RoomDatabase() {
    abstract fun getDao(): com.example.equpmentdb.data.Dao
}