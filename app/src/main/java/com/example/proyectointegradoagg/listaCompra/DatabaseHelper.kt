package com.example.proyectointegradoagg.listaCompra

import android.annotation.SuppressLint
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.proyectointegradoagg.listaCompra.Aplicacion.Companion.BASE
import com.example.proyectointegradoagg.listaCompra.Aplicacion.Companion.VERSION
import com.example.proyectointegradoagg.listaCompra.Aplicacion.Companion.appContext

class DatabaseHelper: SQLiteOpenHelper(appContext, BASE, null, VERSION) {
    //vamos a crear una cadena en la que pondremos la query necesaria para crear la base de datos que queremos
    val crearTabla="CREATE TABLE ${Aplicacion.TABLA} (id INTEGER PRIMARY KEY AUTOINCREMENT, "+
            "producto TEXT NOT NULL, lugar TEXT NOT NULL, " + "precio DOUBLE NOT NULL);"
    @SuppressLint("LongLogTag")
    override fun onCreate(p0: SQLiteDatabase?){
        //Ejecutamos la query que hemos creado anteriormente
        Log.d("BASE DE DATOS >>>>>>>>>>>", crearTabla)
        p0?.execSQL(crearTabla)
    }

    //Cuando actualizemos
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        //Creamos una query para que se elimine la base de datos si ya exite y la ejecutamos
        val drop= "DROP TABLE IF EXISTS ${Aplicacion.TABLA}"
        p0?.execSQL(drop)
        onCreate(p0)
    }
}