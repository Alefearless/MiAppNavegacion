package com.alexis.miappnavegacion

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToProfile: () -> Unit,
    onNavigateToDetails: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("🏠 PANTALLA INICIO")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = onNavigateToProfile) {
            Text("IR AL PERFIL")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = onNavigateToDetails) {
            Text("VER DETALLES")
        }
    }
}