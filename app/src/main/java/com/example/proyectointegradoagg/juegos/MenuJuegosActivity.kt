package com.example.proyectointegradoagg.juegos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectointegradoagg.databinding.ActivityMenuJuegosBinding
import com.example.proyectointegradoagg.juegos.ahorcado.AhorcadoJuegoActivity
import kotlinx.android.synthetic.main.activity_ahorcado_juego.*

class MenuJuegosActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuJuegosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuJuegosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.button.setOnClickListener {
            val i = Intent(this, AhorcadoJuegoActivity::class.java)
            startActivity(i)
        }
    }
}