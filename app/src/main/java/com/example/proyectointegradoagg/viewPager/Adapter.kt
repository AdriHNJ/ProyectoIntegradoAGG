package com.example.proyectointegradoagg.viewPager

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

import androidx.viewpager.widget.PagerAdapter
import com.example.proyectointegradoagg.MainActivity
import com.example.proyectointegradoagg.MenuActivity

import com.example.proyectointegradoagg.R
import com.example.proyectointegradoagg.buscadorImagenes.PixabayActivity
import com.example.proyectointegradoagg.lectorQR.ScannerActivity
import com.example.proyectointegradoagg.maps.MapsActivity


import kotlinx.android.synthetic.main.card_item.view.*



class Adapter (private val context: Context, private val myModelArrayList: ArrayList<MyModel>): PagerAdapter() {

    override fun getCount(): Int {
        return myModelArrayList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.card_item, container, false)

        var model = myModelArrayList[position]
        val titulo = model.titulo
        val descripcion = model.descripcion
        val imagen = model.image


        view.imagenIv.setImageResource(imagen)
        view.titleTv.text = titulo
        view.descripcionTv.text = descripcion

        view.setOnClickListener{
            if (titulo=="Lector QR"){
                Toast.makeText(context, "Abriendo Lector QR...", Toast.LENGTH_LONG).show()
                val i = Intent(view.context, ScannerActivity::class.java)
                context.startActivity(i)
            } else
            if (titulo=="Juegos"){
                Toast.makeText(context, "Abriendo Juegos...", Toast.LENGTH_LONG).show()
            } else
            if (titulo=="Lista de la compra"){
                Toast.makeText(context, "Abriendo Lista de la compra...", Toast.LENGTH_LONG).show()
            } else
            if (titulo=="Reproductor Videos"){
                Toast.makeText(context, "Abriendo Reproductor Videos...", Toast.LENGTH_LONG).show()
            } else
            if (titulo=="Mapas"){
                Toast.makeText(context, "Abriendo Mapas...", Toast.LENGTH_LONG).show()
                val i = Intent(view.context, MapsActivity::class.java)
                context.startActivity(i)
            }
            if (titulo=="Buscador de Imagenes"){
                Toast.makeText(context, "Abriendo $titulo...", Toast.LENGTH_LONG).show()
                val i = Intent(view.context, PixabayActivity::class.java)
                context.startActivity(i)
            }


        }

        container.addView(view, position)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}