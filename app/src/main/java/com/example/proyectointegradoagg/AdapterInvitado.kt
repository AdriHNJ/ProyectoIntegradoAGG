package com.example.proyectointegradoagg

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.viewpager.widget.PagerAdapter
import com.example.proyectointegradoagg.juegos.MenuJuegosActivity
import com.example.proyectointegradoagg.listaCompra.BaseDatosActivity

import com.example.proyectointegradoagg.viewPager.MyModel


import kotlinx.android.synthetic.main.card_item.view.*



class AdapterInvitado(private val context: Context, private val myModelArrayList: ArrayList<MyModel>): PagerAdapter() {

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
        view.descripcionTv1.text = descripcion

        view.setOnClickListener{
            if (titulo=="Juegos") {
                val i = Intent(view.context, MenuJuegosActivity::class.java)
                context.startActivity(i)
            }
            if (titulo=="Lista de la compra") {
                val i = Intent(view.context, BaseDatosActivity::class.java)
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