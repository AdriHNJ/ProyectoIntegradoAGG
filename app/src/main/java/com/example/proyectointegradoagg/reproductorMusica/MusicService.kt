package com.example.proyectointegradoagg.reproductorMusica

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder

class MusicService: Service() {
    private val myBinder = MyBinder()
    var mediaPlayer:MediaPlayer? = null


    override fun onBind(p0: Intent?): IBinder? {
        return myBinder
    }
    inner class MyBinder: Binder(){
        fun currentService(): MusicService {
            return this@MusicService
        }
    }
}