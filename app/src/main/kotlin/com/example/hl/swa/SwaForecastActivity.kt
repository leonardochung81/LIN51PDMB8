package com.example.hl.swa

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu


class SwaForecastActivity : AppCompatActivity() {

    private val controller = ControllerSWA(null, this)
    private val KEY_CITY_ID = "CityId"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forecast)

        val extras = intent.extras
        var cityId: String = ""

        if (extras != null)
            cityId = extras.getString(KEY_CITY_ID)

        if (cityId.equals(""))
            println("No City!!")
        else
            println("City: " + cityId)

        if (savedInstanceState != null) {   // se tiver info no bundle


        } else {    // se não tiver info no bundle
            // ver no sharedPreferences se tem info
            // ...

//            if (controller.isNetworkAvailable() /*&& passou1h?*/) {
//                Log.v(TAG, createLogMessage("makeRequest"))
                controller.owmServerRequestForecastByCityCode(cityId)
//            } else {    // verificar se há dados na estrutura
                // se SIM load de dados



                // se NÃO não faz nada e avisa que não há conexão


        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}