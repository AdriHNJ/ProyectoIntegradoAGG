package com.example.pixabay_08_11_21.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET //Los datos nos llegan por get
    suspend fun getDatosPixaBay(@Url url: String): Response<ListaPixaGson>
}