package com.example.navcontroller.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DetalleScreen(id: Int, onInicio: () -> Unit) = Pantalla("Detalle $id") {
    Text("Producto número $id")
    Button(onClick = onInicio) {
        Text("Volver al inicio")
    }
}