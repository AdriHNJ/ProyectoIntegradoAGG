package com.example.proyectointegradoagg.listaCompra

import android.annotation.SuppressLint
import android.database.DatabaseUtils
import android.util.Log
import com.example.proyectointegradoagg.listaCompra.recyclerCompra.DatosCompra
import java.lang.Exception

class AdministrarListaCompra {

    fun crearProducto(compra: DatosCompra){
        val insertar="INSERT INTO ${Aplicacion.TABLA}(producto, lugar, precio) values('${compra.producto}', '${compra.lugar}', '${compra.precio}');"
        //1*. Crea la conexcion en modo escritura o lectura, en este caso escritura
        val conexion = Aplicacion.databaseHelper.writableDatabase
        try {
            conexion.execSQL(insertar)
            conexion.close()
        } catch (ex: Exception){
            Log.d("Error al insertar:::",ex.message.toString())
        }
    }

    //-----------------------------------------------------------------------------------------------------------------------------
//Esta funcion lee todos los registros y los muestra en el recyclerView
    @SuppressLint("LongLogTag")
    fun readAll(): MutableList<DatosCompra>{
        //Creamos una lista de tipo datos viajes
        val lista = mutableListOf<DatosCompra>()
        //Creamos la query para leer los datos y mostrarlos por origen
        val consulta = "select * from ${Aplicacion.TABLA} order by producto"
        //Nos conectamos leyendo la base de datos
        val conexion = Aplicacion.databaseHelper.readableDatabase
        val total = DatabaseUtils.queryNumEntries(conexion, Aplicacion.TABLA)
        //Mostramos los registros siempre que haya
        if (total>0){
            try {
                val cursor = conexion.rawQuery(consulta, null)
                while (cursor.moveToNext()){
                    var item = DatosCompra(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getDouble(3))
                    lista.add(item)
                }
                conexion.close()
            }catch (ex: Exception){
                Log.d("Error al recuperar registros:::",ex.message.toString())
            }
        }
        return lista
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    //Esta funcion se encarga de borrar un registro recibiendo su id como parámetro
    fun borrar(id: Int){
        val query = "DELETE FROM ${Aplicacion.TABLA} WHERE ID = $id"
        val conexion = Aplicacion.databaseHelper.writableDatabase
        try {
            conexion.execSQL(query)
            conexion.close()
        } catch (ex: Exception){
            Log.d("ERROR:::","ERROR AL BORRAR::: "+ ex.message.toString())
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------
    //Esta función se encarga de actualizar un regitro de la base de datos cuando le pasemos una id
    fun update(c: DatosCompra){
        val query = "UPDATE ${Aplicacion.TABLA} SET producto='${c.producto}', lugar='${c.lugar}', precio='${c.precio}' WHERE id = ${c.id}"
        val conexion = Aplicacion.databaseHelper.writableDatabase
        try {
            conexion.execSQL(query)
            conexion.close()
        } catch (ex: Exception){
            Log.d("ERROR:::","ERROR AL ACTUALIZAR "+ ex.message.toString())
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------
    //Esta funcion borra toda la base de datos
    fun borrarTodo(){
        val q = "DELETE FROM ${Aplicacion.TABLA}"
        val conexion = Aplicacion.databaseHelper.writableDatabase
        try {
            conexion.execSQL(q)
            conexion.close()
        } catch (ex: Exception){
            Log.d("ERROR:::","ERROR AL ACTUALIZAR "+ ex.message.toString())
        }
    }
}