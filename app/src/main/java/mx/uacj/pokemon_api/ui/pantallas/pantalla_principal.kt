package mx.uacj.pokemon_api.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_SavedStateHandleModule
import mx.uacj.pokemon_api.viewmodels.PokemonesViewModel


@Composable
fun PantallaPrincipal(modificador: Modifier = Modifier,
                      controlador_pokemones: PokemonesViewModel = hiltViewModel())
{
    Column(modifier = modificador){
        Text("Hola mundo ${controlador_pokemones.pokemones.value.size}")
    }

    LazyColumn(modifier = Modifier.verticalScroll(rememberScrollState())) {
        for(pokemon in controlador_pokemones.pokemones.value){
            Text("POKEMONO: ${pokemon.name}")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewPantallaPrincipal(){
    PantallaPrincipal()
}
