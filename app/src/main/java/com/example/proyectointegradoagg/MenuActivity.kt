package com.example.proyectointegradoagg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import com.example.proyectointegradoagg.databinding.ActivityMenuBinding
import com.example.proyectointegradoagg.viewPager.Adapter
import com.example.proyectointegradoagg.viewPager.MyModel
import kotlinx.android.synthetic.main.activity_menu.*

enum class Providers{
    BASIC,
    GOOGLE,
    INVITED
}

class MenuActivity : AppCompatActivity() {
    var email=""
    var provider=""
    lateinit var prefs: Prefs
    lateinit var binding: ActivityMenuBinding

    private lateinit var adapter: Adapter
    private lateinit var myModelList: ArrayList<MyModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        prefs = Prefs(this)
        guardardatos()
        cargarCards()
        cogerDatos()

        //Añadimos el onpagelistener
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                //val title = myModelList[position].titulo
                //actionBar.title = title
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

    private fun cogerDatos() {
        val bundle = intent.extras

        email = bundle?.getString("EMAIL").toString()
        provider = bundle?.getString("PROVIDER").toString()

        binding.txtEmail.text=email
        binding.txtProvider.text=provider
    }

    private fun guardardatos() {
        prefs.guardarEmail(email)
        prefs.guardarProvider(provider)
    }

    private fun cargarCards() {
        //iniciamos la lista
        myModelList = ArrayList()

        //añadimos los items
        myModelList.add(MyModel("Lector QR", "Lee todos los códigos QR y códigos de barras", R.drawable.brochure))
        myModelList.add(MyModel("Lista de la compra", "Crea tu lista de la compra, y no te olvides de nada!", R.drawable.namecard))
        //myModelList.add(MyModel("Juegos", "¿Te aburres? Abre los juegos y pasa un buen rato", R.drawable.poster))
        myModelList.add(MyModel("Reproductor Musica", "Abre el reproductor y reproduce tus vídeos favoritos", R.drawable.sticker))
        myModelList.add(MyModel("Mapas", "Planea tus viajes en este mapa", R.drawable.brochure))
        myModelList.add(MyModel("Buscador de Imagenes", "Busca Imagenes", R.drawable.poster))

        adapter = Adapter(this, myModelList)

        viewPager.adapter = adapter

        viewPager.setPadding(100, 0,100,0)

    }

}