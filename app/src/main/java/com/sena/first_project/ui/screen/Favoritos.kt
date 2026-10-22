package com.sena.first_project.ui.screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Favoritos(onVolver: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Hola desde Favoritos")

        Button(onClick = onVolver) {
            Text("Volver")
        }
    }
}