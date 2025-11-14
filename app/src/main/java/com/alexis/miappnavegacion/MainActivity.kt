package com.alexis.miappnavegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexis.miappnavegacion.ui.theme.MiAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiAppTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "inicio"
    ) {
        composable("inicio") {
            HomeScreen(
                onNavigateToProfile = { navController.navigate("perfil") },
                onNavigateToDetails = { navController.navigate("detalles") }
            )
        }
        composable("perfil") {
            ProfileScreen { navController.popBackStack() }
        }
        composable("detalles") {
            DetailsScreen { navController.popBackStack() }
        }
    }
}