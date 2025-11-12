package mx.uacj.pokemon_api.ui.molecula

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.uacj.pokemon_api.modelos.Pokemon

@Composable
fun PokemonLista(pokemon: Pokemon, index: Int, modificador: Modifier = Modifier) {

    // Tomar el nombre del primer tipo para decidir el color de fondo
    val tipoPrincipal = pokemon.types.firstOrNull()?.type?.name?.lowercase() ?: ""

    // Asignar color según el tipo principal
    val backgroundColor = when (tipoPrincipal) {
        "fire" -> Color(0xFFFFA726)      // Fuego
        "water" -> Color(0xFF64B5F6)     // Agua
        "grass" -> Color(0xFFA5D6A7)     // Planta
        "electric" -> Color(0xFFFFF176)  // Eléctrico
        "psychic" -> Color(0xFFF48FB1)   // Psíquico
        "ice" -> Color(0xFFB3E5FC)       // Hielo
        "rock" -> Color(0xFFD7CCC8)      // Roca
        "ground" -> Color(0xFFE0C68C)    // Tierra
        "poison" -> Color(0xFFCE93D8)    // Veneno
        "bug" -> Color(0xFF9CCC65)       // Bicho
        "flying" -> Color(0xFF90CAF9)    // Volador
        "ghost" -> Color(0xFFB39DDB)     // Fantasma
        "dragon" -> Color(0xFF9575CD)    // Dragón
        "fairy" -> Color(0xFFF8BBD0)     // Hada
        else -> Color(0xFFDEF6D8)        // Por defecto
    }

    // Mostrar nombres de todos los tipos en texto (no objetos)
    val tiposTexto = pokemon.types.joinToString(", ") { it.type.name }

    Card(
        modifier = modificador
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(8.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(backgroundColor) // Fondo depende del tipo
                .padding(10.dp)
        ) {
            Text(
                text = "${index + 1}. ${pokemon.name.uppercase()}",
                color = Color(0xFF1B5E20),
                fontSize = 20.sp
            )
            Text("Altura: ${pokemon.height}")
            Text("Peso: ${pokemon.weight}")
            Text("Tipo(s): $tiposTexto")
        }
    }
}
