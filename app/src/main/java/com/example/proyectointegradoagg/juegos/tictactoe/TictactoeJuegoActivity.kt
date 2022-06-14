package com.example.proyectointegradoagg.juegos.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectointegradoagg.databinding.ActivityTictactoejuegoBinding

class TictactoeJuegoActivity : AppCompatActivity() {
    lateinit var binding: ActivityTictactoejuegoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTictactoejuegoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListener()
    }

    private fun setListener() {
        binding.button.setOnClickListener {
            val i = Intent(this, GameActivity::class.java)
            startActivity(i)
        }
    }

}