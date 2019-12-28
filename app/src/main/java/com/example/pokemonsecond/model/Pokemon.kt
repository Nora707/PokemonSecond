package com.example.pokemonsecond.model

data class Pokemon (val name: String, val region: String, val maxCp: Int, val weakness: Array<Type>, val strongAgainst: Array<Type> ) {
    override fun toString(): String {
        return "'$name'"
    }

}