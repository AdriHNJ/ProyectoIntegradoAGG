package com.example.proyectointegradoagg

import android.content.Context
import android.provider.ContactsContract


class Prefs(val c: Context) {
    val FICHERO = "ficheroDatos"
    val EMAIL = "email"
    val PROVIDER = "provider"
    val storage = c.getSharedPreferences(FICHERO, 0)

    public fun guardarEmail (email: String){
        storage.edit().putString(EMAIL, email).apply()
    }

    public fun guardarProvider (p: String){
        storage.edit().putString(PROVIDER, p).apply()
    }

    public fun leerEmail(): String? {
        return storage.getString(EMAIL, null)
    }

    public fun leerProvider(): String? {
        return storage.getString(PROVIDER, null)
    }

    public fun borraTodo(){
        storage.edit().clear().apply()
    }
}