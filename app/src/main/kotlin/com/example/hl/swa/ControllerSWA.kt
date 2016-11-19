package com.example.hl.swa

import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest

class ControllerSWA : AppCompatActivity {

    private val TAG = javaClass.simpleName

    var BASE_URL = "http://api.openweathermap.org/data/2.5/"
    var REQUEST_FORECAST = "forecast?id="
    var REQUEST_WEATHER = "weather?id="

    var CITY_NAME_COUNTRY_CODE = "Lisbon,PT"
    var CITY_ID_LISBON = "2267057"

    var PARAM_APPID = "&appid="
    var API_ID = "2f0a62dfb82d212f34d7a42ab74ef2a6"    // HUGO: bf3a879ca099380c10d7f454e7d540f6   LEO: 2f0a62dfb82d212f34d7a42ab74ef2a6

    var PARAM_UNITS = "&units="
    var UNIT_METRIC = "metric"

    var PARAM_LIMIT = "&cnt="

//    val ctx : SwaMainActivity?
//    val queue by lazy { Volley.newRequestQueue(this) }


    constructor() {}

    constructor(swaContext: SwaMainActivity) {
         val ctx : SwaMainActivity? = swaContext
    }

    fun owmServerRequestWeatherByCityCode(cityCode: String) {
        // EXAMPLE: http://api.openweathermap.org/data/2.5/weather?id=2267057&units=metric&appid=2f0a62dfb82d212f34d7a42ab74ef2a6
        //val url = BASE_URL + REQUEST_WEATHER + cityCode + PARAM_UNITS + UNIT_METRIC + PARAM_APPID + API_ID
        val url = "http://api.openweathermap.org/data/2.5/weather?id=2267057&units=metric&appid=2f0a62dfb82d212f34d7a42ab74ef2a6"

//        application.requestQueue.add(JsonObjectRequest(url, null,
//                Response.Listener<JSONObject> { response ->
//                    Log.v(TAG, createLogMessage("onResponse"))
//                    println("onResponse: \n" + response.toString())
//                    //                        val text
//                },
//                Response.ErrorListener { error ->
//                    Log.v(TAG, createLogMessage("onErrorResponse"))
//                    println("onErrorResponse: \n" + error.toString())
//                })
//        )

        application.requestQueue.add(JsonObjectRequest(Request.Method.GET,url, null,
                {
                    Log.v(TAG, createLogMessage("onResponse"))
//                    it
//                    println("onResponse: \n" + response.toString())
                },
                {
                    Log.v(TAG, createLogMessage("onErrorResponse"))
//                    println("onResponse: \n" + response.toString())
                })
        )

    }



    /**
     * Helper method that produces a log message with the given method name and suffix.
     * @param methodName The name of the method whose execution is being logged.
     * @param suffix The suffix to be appended to the log message.
     * @return The log message.
     **/
    private fun createLogMessage(methodName: String, suffix: String): String {
        return String.format("%s() [%d] %s", methodName, hashCode(), suffix)
    }

    /**
     * Helper method that produces a log message with the given method name.
     * @param methodName The name of the method whose execution is being logged.
     * @return The log message.
     **/
    private fun createLogMessage(methodName: String): String {
        return createLogMessage(methodName, "")
    }

}








