package com.example.hl.swa

import android.app.ListActivity
import android.os.Bundle
import android.view.Menu


class SwaForecastActivity : ListActivity() {

    private val controller = ControllerSWA(null, this)
    private val KEY_CITY_ID = "CityId"

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_forecast)

        val extras = intent.extras
        var cityId: String = ""

        if (extras != null)
            cityId = extras.getString(KEY_CITY_ID)

        if (cityId.equals(""))
            println("No City!!")
        else
            println("City: " + cityId)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}