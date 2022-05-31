package com.example.proyectointegradoagg.buscadorImagenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pixabay_08_11_21.api.ApiService
import com.example.pixabay_08_11_21.api.PixaGson
import com.example.proyectointegradoagg.databinding.ActivityPixabayBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PixabayActivity : AppCompatActivity() {
    lateinit var adapter: PixabayAdapter
    lateinit var binding: ActivityPixabayBinding
    val URL_BASE="https://pixabay.com/api/"
    val KEY="24239094-88e49b215b278367533c45ba9"
    val tarjetas = mutableListOf<PixaGson>()

    override fun onCreate(savedInstanceState: Bundle?){
        binding = ActivityPixabayBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setRecycler()
        setListener()
    }

    private fun setListener() {
        binding.searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if (!p0.isNullOrEmpty()){
                    getTarjetas(p0.lowercase())
                }
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return true
            }
        })
    }

    private fun getTarjetas(query: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val llamada = getRetrofit().create(ApiService::class.java).getDatosPixaBay("?key=$KEY&per_page=50&q=$query")
            val datos = llamada.body()
            //Los quiero pintar en mi recycler
            //lo tendremos que hacer en el hilo principal
            runOnUiThread {
                //Todo esto se ejecuta en el hilo principal
                if (llamada.isSuccessful){
                    //cargamos el recycler
                    val tarjetasBajadas = datos?.listaPixaGson?: emptyList()
                    tarjetas.clear()
                    tarjetas.addAll(tarjetasBajadas)
                    adapter.notifyDataSetChanged()
                } else{
                    Toast.makeText(this@PixabayActivity, "Error", Toast.LENGTH_LONG).show()
                }
                ocultarTeclado()
            }
        }
    }

    private fun ocultarTeclado() {
        val imn = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imn.hideSoftInputFromWindow(binding.viewRoot.windowToken, 0)
    }

    private fun setRecycler() {
        adapter = PixabayAdapter(tarjetas)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter=adapter
    }

    //Instanciamos retrofit (Siempre se hace igual)
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}