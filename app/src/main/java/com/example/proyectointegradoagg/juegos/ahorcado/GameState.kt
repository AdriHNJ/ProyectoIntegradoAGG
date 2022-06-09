package com.example.proyectointegradoagg.juegos.ahorcado

sealed class GameState {
    class Running(val letrasUsadas: String,
                  val underscoreWord: String,
                  val drawable: Int) : GameState()
    class Lost(val palabrarequerida: String) : GameState()
    class Won(val palabrarequerida: String) : GameState()
}
