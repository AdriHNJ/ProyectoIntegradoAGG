package com.example.proyectointegradoagg.buscadorImagenes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pixabay_08_11_21.api.PixaGson

import com.example.proyectointegradoagg.R
import com.example.proyectointegradoagg.databinding.ActivityPixabayAdapterBinding
import com.squareup.picasso.Picasso

class PixabayAdapter(private var lista: List<PixaGson>) : RecyclerView.Adapter<PixabayAdapter.ViewHolder>() {
    class ViewHolder(v :View): RecyclerView.ViewHolder(v) {
        val binding = ActivityPixabayAdapterBinding.bind(v)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val v = layoutInflater.inflate(R.layout.activity_pixabay_adapter, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lista[position]

        Picasso.get().load(item.imagen)
            .resize(170,150)
            .centerCrop()
            .into(holder.binding.imageView)
    }

    override fun getItemCount(): Int {
        return lista.count()
    }

}