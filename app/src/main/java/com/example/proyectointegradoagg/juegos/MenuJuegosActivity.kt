package com.example.proyectointegradoagg.juegos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectointegradoagg.databinding.ActivityMenuJuegosBinding
import com.example.proyectointegradoagg.juegos.ahorcado.AhorcadoJuegoActivity
import com.example.proyectointegradoagg.juegos.tictactoe.GameActivity
import com.example.proyectointegradoagg.juegos.tictactoe.TictactoeJuegoActivity

class MenuJuegosActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuJuegosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuJuegosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.ahorcadoBtn.setOnClickListener {
            val i = Intent(this, AhorcadoJuegoActivity::class.java)
            startActivity(i)
        }

        binding.tictactoeBtn.setOnClickListener {
            val i = Intent(this, GameActivity::class.java)
            startActivity(i)
        }
    }
}