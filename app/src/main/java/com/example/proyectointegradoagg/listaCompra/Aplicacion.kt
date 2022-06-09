package com.example.proyectointegradoagg.listaCompra

import android.app.Application
import android.content.Context

class Aplicacion: Application(){
    companion object{
        //Creamos las variables necesarias para crear la base de datos
        val BASE = "baseListaCompra"
        val TABLA = "tablaListaCompra"
        val VERSION = 1
        lateinit var appContext: Context
        //Creamos un databaseHelper, la clase estará en otro fichero
        lateinit var databaseHelper:DatabaseHelper
    }

    override fun onCreate() {
        super.onCreate()
        appContext=applicationContext
        databaseHelper= DatabaseHelper()
    }
}