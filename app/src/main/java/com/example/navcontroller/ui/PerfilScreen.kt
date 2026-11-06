package com.example.navcontroller.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PerfilScreen(onSalir: () -> Unit) = Pantalla("Perfil") {
    Button(onClick = onSalir) {
        Text("Cerrar sesión")
    }
}