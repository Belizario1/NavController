package com.example.navcontroller.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.navcontroller.ui.DetalleScreen
import com.example.navcontroller.ui.HomeScreen
import com.example.navcontroller.ui.ListaScreen
import com.example.navcontroller.ui.LoginScreen
import com.example.navcontroller.ui.PerfilScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen(onLogin = {
                navController.navigate(Home) {
                    popUpTo<Login> { inclusive = true }
                    launchSingleTop = true
                }
            })
        }

        composable<Home> {
            HomeScreen(
                onLista = { navController.navigate(Lista) },
                onPerfil = { navController.navigate(Perfil) }
            )
        }

        composable<Lista> {
            ListaScreen(onItem = { id -> navController.navigate(Detalle(id)) })
        }

        composable<Detalle> { entry ->
            val args = entry.toRoute<Detalle>()
            DetalleScreen(
                id = args.id,
                onInicio = { navController.popBackStack<Home>(inclusive = false) }
            )
        }

        composable<Perfil> {
            PerfilScreen(onSalir = {
                navController.navigate(Login) {
                    popUpTo(navController.graph.id) { inclusive = true }
                    launchSingleTop = true
                }
            })
        }
    }
}