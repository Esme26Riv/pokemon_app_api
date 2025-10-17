package mx.uacj.pokemon_api.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_SavedStateHandleModule


@Composable
fun PantallaPrincipal(modificador: Modifier = Modifier){
    Column(modifier = modificador){
        Text("Hola mundo")
    }

}

@Composable
@Preview(showBackground = true)
fun PreviewPantallaPrincipal(){
    PantallaPrincipal()
}
