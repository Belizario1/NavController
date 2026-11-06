package com.example.navcontroller.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ListaScreen(onItem: (Int) -> Unit) = Pantalla("Lista") {
    (1..3).forEach { id ->
        Button(onClick = { onItem(id) }) {
            Text("Producto $id")
        }
    }
}