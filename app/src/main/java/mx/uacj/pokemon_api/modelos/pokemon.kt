package mx.uacj.pokemon_api.modelos

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent

data class HabilidadURL(
    val name: String,
    val url: String
)

data class Habilidad(
    val is_hidden: Boolean,
    val slot: Int,
    val ability: HabilidadURL
)

data class Aullido(
    val latest: String?,
    val legacy: String?
)

data class Sprite(
    val back_default: String?,
    val back_female: String?,
    val back_shiny: String?,
    val back_shiny_female: String?,
    val front_default: String?,
    val front_female: String?,
    val front_shiny: String?,
    val front_shiny_female: String?,
)

data class Pokemon(
    val id: Int,
    val name: String,
    val base_experience: Int,
    val height: Int,
    val is_default: Boolean,
    val order: Int,
    val weight: Int,
    val abilities: List<Habilidad>,

    val sprites: Sprite,

    val cries: Aullido,
    "stats": [
    {
        "base_stat": 35,
        "effort": 0,
        "stat": {
        "name": "speed",
        "url": "https://pokeapi.co/api/v2/stat/6/"
    }
    }
    ],
    "types": [
    {
        "slot": 1,
        "type": {
        "name": "fairy",
        "url": "https://pokeapi.co/api/v2/type/18/"
    }
    }
    ],
    "past_types": [
    {
        "generation": {
        "name": "generation-v",
        "url": "https://pokeapi.co/api/v2/generation/5/"
    },
        "types": [
        {
            "slot": 1,
            "type": {
            "name": "normal",
            "url": "https://pokeapi.co/api/v2/type/1/"
        }
        }
        ]
    }
    ],
    "past_abilities": [
    {
        "generation": {
        "name": "generation-iv",
        "url": "https://pokeapi.co/api/v2/generation/4/"
    },
        "abilities": [
        {
            "ability": null,
            "is_hidden": true,
            "slot": 3
        }
        ]
    }
    ]
}
