package com.example.proyectointegradoagg.juegos.ahorcado

import com.example.proyectointegradoagg.R
import kotlin.random.Random

class GameManager {

    private var letrasusadas: String = ""
    private lateinit var underscoreWord: String
    private lateinit var palabraPorAcertar: String
    private val intentosMaximos = 7
    private var intentos = 0
    private var drawable: Int = R.drawable.game0

    fun startNewGame(): GameState {
        letrasusadas = ""
        intentos = 0
        drawable = R.drawable.game7
        val randomIndex = Random.nextInt(0, GameConstants.words.size)
        palabraPorAcertar = GameConstants.words[randomIndex]
        generateUnderscores(palabraPorAcertar)
        return getGameState()
    }

    fun generateUnderscores(word: String) {
        val sb = StringBuilder()
        word.forEach { char ->
            if (char == '/') {
                sb.append('/')
            } else {
                sb.append("_")
            }
        }
        underscoreWord = sb.toString()
    }

    fun play(letter: Char): GameState {
        if (letrasusadas.contains(letter)) {
            return GameState.Running(letrasusadas, underscoreWord, drawable)
        }

        letrasusadas += letter
        val indexes = mutableListOf<Int>()

        palabraPorAcertar.forEachIndexed { index, char ->
            if (char.equals(letter, true)) {
                indexes.add(index)
            }
        }

        var finalUnderscoreWord = "" + underscoreWord // _ _ _ _ _ _ _ -> E _ _ _ _ _ _
        indexes.forEach { index ->
            val sb = StringBuilder(finalUnderscoreWord).also { it.setCharAt(index, letter) }
            finalUnderscoreWord = sb.toString()
        }

        if (indexes.isEmpty()) {
            intentos++
        }

        underscoreWord = finalUnderscoreWord
        return getGameState()
    }

    private fun getHangmanDrawable(): Int {
        return when (intentos) {
            0 -> R.drawable.game0
            1 -> R.drawable.game1
            2 -> R.drawable.game2
            3 -> R.drawable.game3
            4 -> R.drawable.game4
            5 -> R.drawable.game5
            6 -> R.drawable.game6
            7 -> R.drawable.game7
            else -> R.drawable.game7
        }
    }

    private fun getGameState(): GameState {
        if (underscoreWord.equals(palabraPorAcertar, true)) {
            return GameState.Won(palabraPorAcertar)
        }

        if (intentos == intentosMaximos) {
            return GameState.Lost(palabraPorAcertar)
        }

        drawable = getHangmanDrawable()
        return GameState.Running(letrasusadas, underscoreWord, drawable)
    }
}