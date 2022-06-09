package com.example.proyectointegradoagg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.proyectointegradoagg.databinding.ActivityMenuInvitadoBinding
import com.example.proyectointegradoagg.viewPager.MyModel
import kotlinx.android.synthetic.main.activity_menu_invitado.*

enum class Providers1{
    INVITED
}

class MenuInvitadoActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuInvitadoBinding
    var provider=""
    lateinit var prefs: Prefs

    private lateinit var adapterInvitado: AdapterInvitado
    private lateinit var myModelListInvitado: ArrayList<MyModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuInvitadoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        prefs = Prefs(this)
        guardardatos()
        cargarCards()
        cogerDatos()

        //Añadimos el onpagelistener
        viewPagerInvitado.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
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

        provider = bundle?.getString("PROVIDER").toString()
        binding.txtProvider2.text=provider
    }

    private fun cargarCards() {
        myModelListInvitado = ArrayList()

        myModelListInvitado.add(MyModel("Hola buenas", "Adios buenas", R.drawable.logo_app))
        myModelListInvitado.add(MyModel("Lista de la compra", "Adios 2", R.drawable.poster))
        myModelListInvitado.add(MyModel("Juegos", "Adios 3", R.drawable.brochure))

        adapterInvitado = AdapterInvitado(this, myModelListInvitado)

        viewPagerInvitado.adapter = adapterInvitado

        viewPagerInvitado.setPadding(100, 0,100,0)
    }

    private fun guardardatos() {
        prefs.guardarProvider(provider)
    }
}