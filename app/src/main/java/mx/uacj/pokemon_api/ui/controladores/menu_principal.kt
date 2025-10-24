package mx.uacj.pokemon_api.ui.controladores

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mx.uacj.pokemon_api.ui.pantallas.PantallaPrincipal


@Composable
fun MenuPrincipal(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        PantallaPrincipal(modificador = Modifier.padding(innerPadding))
    }
}
