package com.example.proyectointegradoagg.listaCompra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectointegradoagg.databinding.ActivityAddBinding
import com.example.proyectointegradoagg.listaCompra.recyclerCompra.DatosCompra

class AddActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAddBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.btnLimpiar.setOnClickListener {
            binding.etAddProducto.setText("")
            binding.etAddLugar.setText("")
            binding.etAddPrecio.setText("")
            binding.etAddProducto.requestFocus()
        }
        binding.btnGuardar.setOnClickListener{
            guardarContacto()
        }
    }

    private fun guardarContacto() {
        val producto = binding.etAddProducto.text.toString().trim()
        val lugar = binding.etAddLugar.text.toString().trim()
        val precio = binding.etAddPrecio.text.toString().trim()
        if (producto.isEmpty()){
            binding.etAddProducto.setError("El nombre origen no puede estar vacío")
            return
        }
        if (lugar.isEmpty()){
            binding.etAddLugar.setError("Rellene este campo!!!")
            return
        }
        if (precio.isEmpty()){
            binding.etAddPrecio.setError("Rellene este campo!!!")
            return
        }
        val esteProducto = DatosCompra(1, producto, lugar, precio.toDouble())
        val ac=AdministrarListaCompra()
        ac.crearProducto(esteProducto)
        Toast.makeText(this, "Producto Guardado", Toast.LENGTH_LONG).show()
        onBackPressed()
    }
}