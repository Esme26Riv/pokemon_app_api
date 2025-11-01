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
    Card(//diseño limpio
        modifier = modificador
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(10.dp)//bordes redondos
    ) {
        Column(
            modifier = Modifier
                .background(Color(0xFFDEF6D8)) // Verde claro de fondo
                .padding(10.dp)
        ) {
            Text(
                text = "${index + 1}. ${pokemon.name.uppercase()}", // Cambia letras a mayusculas
                color = Color(0xFF1B5E20), // Verde oscuro
                fontSize = 20.sp
            )
            Text("Altura: ${pokemon.height}")
            Text("Peso: ${pokemon.weight}")
        }
    }
}
