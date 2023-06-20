package com.example.equpmentdb.uielements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.equpmentdb.data.Card


@Composable
fun CardEquipment(card: Card) {
    val fontSize = 18.sp
    val padding = 4.dp
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(padding)
    ) {
        Column(modifier = Modifier.padding(padding)) {
            Text(
                text = card.name,
                fontSize = fontSize,
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "Date of start: ${card.dataStart.toString()}", fontSize = fontSize)
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "Date of end: ${card.dateEnd.toString()}", fontSize = fontSize)
                }
            }
            Text(text = "Days left: ${card.period}")
        }
    }
}