package com.example.equpmentdb.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.equpmentdb.data.Card
import com.example.equpmentdb.uielements.CardEquipment
import com.example.equpmentdb.uielements.FAB
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(floatingActionButton = { FAB() }, floatingActionButtonPosition = FabPosition.Center) {
        LazyColumn(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
        ) {
            repeat(20) {
                item {
                    val card = Card(name = "Dag", dataStart = null, dateEnd = null, period = 1, daysLeft = 300)
                    CardEquipment(card)
                }
            }

        }
    }
}