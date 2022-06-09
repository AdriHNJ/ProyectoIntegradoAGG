package com.example.proyectointegradoagg.listaCompra.recyclerCompra

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegradoagg.R
import com.example.proyectointegradoagg.databinding.CompraLayoutBinding
import com.example.proyectointegradoagg.listaCompra.AdministrarListaCompra
import com.example.proyectointegradoagg.listaCompra.BaseDatosActivity

class AdapterCompras(private val lista: MutableList<DatosCompra>): RecyclerView.Adapter<AdapterCompras.ComprasHolder>() {
    lateinit var context: Context
    class ComprasHolder (v: View): RecyclerView.ViewHolder(v){
        val binding = CompraLayoutBinding.bind(v)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComprasHolder {
        context = parent.context
        val layoutInflater = LayoutInflater.from(parent.context)
        val v = layoutInflater.inflate(R.layout.compra_layout, parent, false)
        return ComprasHolder(v)
    }

    override fun onBindViewHolder(holder: ComprasHolder, position: Int) {
        var elemento = lista[position]
        holder.binding.tvProducto.text = elemento.producto
        holder.binding.tvLugar.text = elemento.lugar
        holder.binding.tvPrecio.text = elemento.precio.toString()
        holder.binding.tvId.text = elemento.id.toString()
        holder.binding.imageButton.setOnClickListener {
            val alertDialog = AlertDialog.Builder(context)
                .setTitle("Alerta Borrar")
                .setMessage("¿Desea borrar permanentemente el producto?")
                .setNegativeButton("Cancelar"){v,_ -> v.dismiss() }
                .setPositiveButton("Aceptar"){_,_->
                    AdministrarListaCompra().borrar(holder.binding.tvId.text.toString().trim().toInt())
                }
                .setCancelable(false)
                .create()
                .show()
        }
    }


    override fun getItemCount(): Int {
        return lista.count()
    }

    public fun removeAt(position: Int){
        lista.removeAt(position)
        notifyItemRemoved(position)
    }
}