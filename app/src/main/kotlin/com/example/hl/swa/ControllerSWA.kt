package com.example.hl.swa

import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_swa_main.*
import org.json.JSONObject

class ControllerSWA(val ctx: SwaMainActivity?) : AppCompatActivity() {
    init {  }

    private val TAG = javaClass.simpleName

    val BASE_URL: String = "http://api.openweathermap.org/data/2.5/"
    val REQUEST_FORECAST: String = "forecast?id="
    val REQUEST_WEATHER: String = "weather?id="

    val CITY_NAME_COUNTRY_CODE: String = "Lisbon,PT"
    val CITY_ID_LISBON: String = "2267057"

    val PARAM_APPID: String = "&appid="
    val API_ID: String = "2f0a62dfb82d212f34d7a42ab74ef2a6"    // HUGO: bf3a879ca099380c10d7f454e7d540f6   LEO: 2f0a62dfb82d212f34d7a42ab74ef2a6

    val PARAM_UNITS: String = "&units="
    val UNIT_METRIC: String = "metric"

    val PARAM_LIMIT: String = "&cnt="

    fun owmServerRequestWeatherByCityCode(cityCode: String) {
        // EXAMPLE: http://api.openweathermap.org/data/2.5/weather?id=2267057&units=metric&appid=2f0a62dfb82d212f34d7a42ab74ef2a6
        val url = BASE_URL + REQUEST_WEATHER + cityCode +PARAM_UNITS + UNIT_METRIC + PARAM_APPID + API_ID

        ctx!!.application.requestQueue.add(JsonObjectRequest(Request.Method.GET, url, null,
                {
                    val mainFromJO = it.get("main") as JSONObject

                    ctx!!.currentTemp!!.text = mainFromJO["temp"].toString()
                    minTemp!!.text = mainFromJO["temp_min"].toString()
                    maxTemp!!.text = mainFromJO["temp_max"].toString()
//                    val main = Main(mainFromJO["temp"])
//                    Log.v(TAG, createLogMessage("onResponse"))
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








