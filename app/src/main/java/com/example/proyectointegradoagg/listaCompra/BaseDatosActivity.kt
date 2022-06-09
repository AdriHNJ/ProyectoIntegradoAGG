package com.example.proyectointegradoagg.listaCompra

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegradoagg.R
import com.example.proyectointegradoagg.databinding.ActivityBaseDatosBinding
import com.example.proyectointegradoagg.databinding.CompraLayoutBinding
import com.example.proyectointegradoagg.listaCompra.recyclerCompra.AdapterCompras
import com.example.proyectointegradoagg.listaCompra.recyclerCompra.DatosCompra
import kotlinx.android.synthetic.main.activity_ahorcado_juego.*
import kotlinx.android.synthetic.main.activity_base_datos.*

class BaseDatosActivity : AppCompatActivity() {
    lateinit var binding: ActivityBaseDatosBinding
    lateinit var adapter: AdapterCompras
    lateinit var lista: MutableList<DatosCompra>
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityBaseDatosBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lista = mutableListOf()
        setBtnAdd()
        setRecycler()
        setUpRefresh()

    }

    private fun setUpRefresh() {
        binding.swipeRefresh.setOnRefreshListener {
            setRecycler()
            swipeRefresh.isRefreshing = false
        }

    }

    private fun setUpSwipe() {
        val itemTouch = object: ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val adapter = binding.recyclerView.adapter as AdapterCompras
                adapter.removeAt(viewHolder.adapterPosition)
                //AdministrarListaCompra().borrar()
            }

        }
        val ith = ItemTouchHelper(itemTouch)
        ith.attachToRecyclerView(binding.recyclerView)
    }

    private fun setRecycler() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        rellenarLista()
        adapter = AdapterCompras(lista)
        binding.recyclerView.adapter=adapter
    }

    private fun rellenarLista() {
        val ac = AdministrarListaCompra()
        lista = ac.readAll()
    }

    private fun setBtnAdd() {
        binding.btnAdd.setOnClickListener{
            addProducto()
        }
    }

    private fun addProducto() {
        val i = Intent(this, AddActivity::class.java)
        startActivity(i)
    }

    override fun onRestart() {
        super.onRestart()
        setRecycler()
    }

    override fun onResume() {
        super.onResume()
        setRecycler()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_opciones, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_salir->{
                finishAndRemoveTask()
            }
            else -> {
                AdministrarListaCompra().borrarTodo()
                setRecycler()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}