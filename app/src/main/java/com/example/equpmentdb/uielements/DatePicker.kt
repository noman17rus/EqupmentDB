package com.example.equpmentdb.uielements

import android.annotation.SuppressLint
import android.icu.text.SimpleDateFormat
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.equpmentdb.screens.AddViewModel
import java.util.Date

@SuppressLint("SimpleDateFormat")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateInputPicker(viewModel: AddViewModel) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        val state = rememberDatePickerState(initialDisplayMode = DisplayMode.Input)
        DatePicker(
            state = state,
            modifier = Modifier.padding(36.dp),
            title = { Text(text = "Выберите дату последней поверки") }
        )
        val ms = state.selectedDateMillis
        ms?.let { viewModel.editDate(it.convertLongToDate()) }
        //Text("Entered date timestamp: ${state.selectedDateMillis?.convertLongToDate() ?: "no input"}")

    }
}

@SuppressLint("SimpleDateFormat")
fun Long.convertLongToDate(): String {
    val date = Date(this)
    val format = SimpleDateFormat("dd.MM.yyyy")
    return format.format(date)
}


