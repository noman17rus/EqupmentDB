package com.example.equpmentdb.uielements

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun FAB() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(50.dp),
        shape = ShapeDefaults.Medium
    ) {
        Icon(Icons.Default.Add, contentDescription = null)
    }
}