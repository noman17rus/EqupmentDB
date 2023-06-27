package com.example.equpmentdb.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class Repository(private val dao: Dao) : EqRepository {
    override suspend fun readAll(): List<Equipment> {
        return coroutineScope {
            async(Dispatchers.Main) { dao.getEquipment() }.await()
        }
    }

    override suspend fun create(equipment: Equipment, update: () -> Unit) {
        coroutineScope {
            launch(Dispatchers.IO) {
                dao.addEquipment(equipment)
                update()
            }
        }
    }

    override suspend fun delete(equipment: Equipment, update: () -> Unit) {
        coroutineScope {
            launch(Dispatchers.IO) {
                dao.deleteEquipment(equipment)
                update()
            }
        }
    }
}