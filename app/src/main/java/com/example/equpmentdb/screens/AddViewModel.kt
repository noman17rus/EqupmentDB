package com.example.equpmentdb.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.equpmentdb.data.EqRepository
import com.example.equpmentdb.data.Equipment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddViewModel(val database: EqRepository) : ViewModel() {
    private val _period = MutableLiveData(0f)
    val period = _period

    private val _name = MutableLiveData("")
    val name = _name

    private val _date = MutableLiveData("")
    val date = _date

    private val _equipmentList = MutableLiveData<List<Equipment>>()
    val equipmentList:LiveData<List<Equipment>> = _equipmentList

    fun editPeriod(i: Float) {
        _period.value = i
    }

    fun editName(s: String) {
        name.value = s
    }

    fun editDate(s: String) {
        date.value = s
    }

    fun readAllEq() {
        viewModelScope.launch(Dispatchers.Main) {
            _equipmentList.value = database.readAll()
        }
    }
    fun createEq(equipment: Equipment) {
        viewModelScope.launch(Dispatchers.IO) {
            database.create(equipment) { readAllEq() }
        }
    }

    fun deleteEq(equipment: Equipment) {
        viewModelScope.launch(Dispatchers.IO) {
            database.delete(equipment) { readAllEq() }
        }
    }
}


class AddViewModelFactory(private val _database: EqRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AddViewModel(database = _database) as T
    }
}