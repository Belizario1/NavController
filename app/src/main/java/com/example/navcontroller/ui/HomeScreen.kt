package com.example.navcontroller.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(onLista: () -> Unit, onPerfil: () -> Unit) = Pantalla("Home") {
    Button(onClick = onLista) {
        Text("Ver lista")
    }
    Button(onClick = onPerfil) {
        Text("Mi perfil")
    }
}
