package com.example.navcontroller.navigation

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
object Lista

@Serializable
data class Detalle(val id: Int)

@Serializable
object Perfil