package com.example.equpmentdb.uielements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.equpmentdb.data.Equipment
import com.example.equpmentdb.screens.AddViewModel

@Composable
fun CardEquipment(equipment: Equipment, viewModel: AddViewModel) {
    val fontSize = 18.sp
    val padding = 4.dp
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(padding)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.weight(0.85f)) {
                Column(
                    modifier = Modifier
                        .padding(padding)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "card.name",
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Serif,
                        fontStyle = FontStyle.Italic
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Column(modifier = Modifier) {
                            Text(
                                text = "Date of start: ${equipment.dataStart}",
                                fontSize = fontSize
                            )
                        }
                        Column(modifier = Modifier) {
                            Text(
                                text = "Date of end: ${equipment.dateEnd}",
                                fontSize = fontSize
                            )
                        }
                    }
                    Text(text = "Period: ${equipment.period}")
                    Text(text = "Days left: ${equipment.daysLeft}")
                }
            }
            Box(modifier = Modifier.weight(0.15f).fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(Icons.Default.Delete, contentDescription = null, modifier = Modifier.clickable {
                    viewModel.deleteEq(equipment)
                }.size(46.dp))
            }

        }
    }
}