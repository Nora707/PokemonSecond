package com.example.pokemonsecond.activities

import me.sargunvohra.lib.pokekotlin.client.PokeApiClient

class getPokemonNames {
    fun getNames(args: Array<String>) {
        val pokeApi = PokeApiClient()
        val names = pokeApi.getPokemonList(0, 100);
        println(names)
    }
}