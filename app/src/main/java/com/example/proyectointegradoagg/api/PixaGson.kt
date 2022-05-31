package com.example.pixabay_08_11_21.api

import com.google.gson.annotations.SerializedName

data class PixaGson(
    @SerializedName("user") var user: String,
    @SerializedName("likes")var likes: Int,
    @SerializedName("webformatURL") var imagen: String,
    @SerializedName("downloads") var descargas: Int,
    @SerializedName("views") var visitas: Int
)
data class ListaPixaGson(
    @SerializedName("hits") var listaPixaGson: List<PixaGson>
)