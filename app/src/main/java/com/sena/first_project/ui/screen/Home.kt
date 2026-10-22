package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Home(
    onirProducto: () -> Unit,
    onIrFavoritos: () -> Unit,
    onIrPerfil: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Hola desde el Home")

        Button(onClick = onirProducto) {
            Text("Ir a Productos")
        }

        Button(onClick = onIrFavoritos) {
            Text("Ir a Favoritos")
        }

        Button(onClick = onIrPerfil) {
            Text("Ir a Perfil")
        }
    }
}