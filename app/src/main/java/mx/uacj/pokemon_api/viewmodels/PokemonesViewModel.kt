package mx.uacj.pokemon_api.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import mx.uacj.pokemon_api.repositorio_api.RepositorioPokemones
import javax.inject.Inject

@HiltViewModel
class PokemonesViewModel @Inject constructor(
    private val repositorio: RepositorioPokemones
): ViewModel(){
    private var estado = mutableStateOf("cargando")

    fun descargar(){
        // Funcion para descargar todo de la api.
    }
}
