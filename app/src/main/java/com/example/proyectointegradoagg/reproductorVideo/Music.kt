package com.example.proyectointegradoagg.reproductorVideo

import java.util.concurrent.TimeUnit

data class Music (val id: String, val titulo: String, val album: String, val artista:String, val duracion: Long = 0, val path: String,
val artUri:String)


//Convertir Milisegundos a minutos y segundos - Duración de la cancion
fun formatDuration (duration: Long):String{
    val minutos = TimeUnit.MINUTES.convert(duration, TimeUnit.MILLISECONDS)
    val segundos = (TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS)-minutos*TimeUnit.SECONDS.convert(1, TimeUnit.MINUTES))
    return String.format("%02d:%02d", minutos, segundos)
}

