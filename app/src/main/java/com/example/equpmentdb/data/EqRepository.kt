package com.example.equpmentdb.data

interface EqRepository {
    suspend fun readAll(): List<Equipment>
    suspend fun create(equipment: Equipment, update: () -> Unit)
    suspend fun delete(equipment: Equipment, update: () -> Unit)
}