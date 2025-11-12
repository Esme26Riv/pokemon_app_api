package mx.uacj.pokemon_api.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import mx.uacj.pokemon_api.modelos.Pokemon

@Composable
fun PantallaPokemon(modificador: Modifier = Modifier, pokemon: Pokemon) {

    // Obtener el primer tipo del Pokémon
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
        else -> Color(0xFFE8F5E9)        // Por defecto (verde claro)
    }

    // Estructura principal con fondo dinámico
    Column(
        modifier = modificador
            .fillMaxSize()
            .background(backgroundColor) //Fondo depende del tipo
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Nombre del Pokémon
        Text(
            text = "Nombre: ${pokemon.name.uppercase()}",
            fontSize = 24.sp,
            color = Color(0xFF1B5E20), // verde oscuro
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 10.dp)
                .border(2.dp, Color(0xFF1B5E20), RoundedCornerShape(8.dp))
                .padding(8.dp)
        )

        // Tipos
        for (tipos in pokemon.types) {
            Text(
                text = "Tipo: ${tipos.type.name}",
                color = Color(0xFF2E7D32),
                fontSize = 18.sp,
                modifier = Modifier.padding(4.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Estadísticas
        Text(
            text = "Estadísticas:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B5E20),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        //caja
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color(0xFF1B5E20), RoundedCornerShape(10.dp))
                .background(Color.White)
                .padding(10.dp)
        ) {
            for (estadistica in pokemon.stats) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween //separacion en los extremos
                ) {
                    Text(
                        text = estadistica.stat.name,
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                    Text(//valor de base de la estadistica base_stat
                        text = "Base: ${estadistica.base_stat} | Esfuerzo: ${estadistica.effort}",//valor de esfuerzo effort
                        fontSize = 16.sp,
                        color = Color.DarkGray
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun previsualizacion_PantallaPokemon() {
    // PantallaPokemon()
}

