package com.example.hl.swa

import android.app.Application
import android.util.Log
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class SuperWeatherApplicationApp() : Application() {

    val reqQueue by lazy { Volley.newRequestQueue(this) }

    override fun onCreate() {
        super.onCreate()
        Log.d("Profs/App", "ProfsApp onCreate")
    }
}

val Application.requestQueue : RequestQueue
    get() = (this as SuperWeatherApplicationApp).reqQueue