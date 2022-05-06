package com.example.proyectointegradoagg

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.proyectointegradoagg.databinding.ActivityMenuBinding
import com.example.proyectointegradoagg.viewPager.Adapter
import com.example.proyectointegradoagg.viewPager.MyModel
import kotlinx.android.synthetic.main.activity_menu.*


class MenuActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuBinding
    private lateinit var actionBar: ActionBar

    private lateinit var adapter: Adapter
    private lateinit var myModelList: ArrayList<MyModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        actionBar = this.supportActionBar!!

        cargarCards()

        //Añadimos el onpagelistener
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                val title = myModelList[position].titulo
                actionBar.title = title
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

    private fun cargarCards() {
        //iniciamos la lista
        myModelList = ArrayList()

        //añadimos los items
        myModelList.add(MyModel("Lector QR", "Lee todos los códigos QR y códigos de barras", R.drawable.brochure))
        myModelList.add(MyModel("Lista de la compra", "Crea tu lista de la compra, y no te olvides de nada!", R.drawable.namecard))
        myModelList.add(MyModel("Juegos", "¿Te aburres? Abre los juegos y pasa un buen rato", R.drawable.poster))
        myModelList.add(MyModel("Reproductor Videos", "Abre el reproductor y reproduce tus vídeos favoritos", R.drawable.sticker))

        adapter = Adapter(this, myModelList)

        viewPager.adapter = adapter

        viewPager.setPadding(100, 0,100,0)

    }

}