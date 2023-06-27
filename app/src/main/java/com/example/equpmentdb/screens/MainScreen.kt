package com.example.equpmentdb.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.equpmentdb.data.Equipment
import com.example.equpmentdb.uielements.CardEquipment
import com.example.equpmentdb.uielements.FAB


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(viewModel: AddViewModel) {
    val listEq: MutableState<List<Equipment>> = remember { mutableStateOf(listOf()) }
    listEq.value = viewModel.equipmentList.observeAsState(listOf()).value
    Scaffold(floatingActionButton = { FAB() }, floatingActionButtonPosition = FabPosition.Center) {
        LazyColumn(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
        ) {
            items(listEq.value) {
                CardEquipment(equipment = it, viewModel = viewModel)
            }
        }
    }
}