package com.example.pixabay_08_11_21.api

import com.google.gson.annotations.SerializedName

data class PixaGson(
    @SerializedName("webformatURL") var imagen: String,
)
data class ListaPixaGson(
    @SerializedName("hits") var listaPixaGson: List<PixaGson>
)