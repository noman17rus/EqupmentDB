package com.example.equpmentdb.uielements

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.example.equpmentdb.screens.AddViewModel

@Composable
fun SliderYears(viewModel: AddViewModel) {
    val padding = 10.dp
    var sliderPosition by remember { mutableStateOf(1f) }
    sliderPosition = viewModel.period.observeAsState(1f).value
    Text(
        text = "Интервал поверки(год): ${sliderPosition.toInt()}",
        modifier = Modifier.padding(padding)
    )
    Slider(
        modifier = Modifier
            .semantics { contentDescription = "Localized Description" }
            .padding(padding),
        value = sliderPosition,
        onValueChange = {
            viewModel.editPeriod(it)
        },
        valueRange = 1f..3f,
        steps = 1
    )
}
