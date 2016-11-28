package com.example.hl.swa

import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_swa_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.security.Timestamp
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

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
                    val weatherFromJO = ((it.get("weather") as JSONArray)[0] as JSONObject)
                    val windFromJO = it.get("wind") as JSONObject
                    val sysFromJO = it.get("sys") as JSONObject

                    val mainObj = Main (
                            mainFromJO["temp"] as Double,
                            (mainFromJO["pressure"] as Int).toDouble(),
                            mainFromJO["humidity"] as Int,
                            (mainFromJO["temp_min"] as Int).toDouble(),
                            (mainFromJO["temp_max"] as Int).toDouble(),
                            null /*mainFromJO["seaLevel"] as Double*/,
                            null /*mainFromJO["grdLevel"] as Double*/)

                    val weatherObj = Weather (
                            weatherFromJO["id"] as Int,
                            weatherFromJO["main"] as String,
                            weatherFromJO["description"] as String,
                            weatherFromJO["icon"] as String
                    )

                    val windObj = Wind (
                            windFromJO["speed"] as Double?,
                            (windFromJO["deg"] as Int).toDouble()
                    )

                    val sysObj = Sys (
                            sysFromJO["type"] as Int,
                            sysFromJO["id"] as Int,
                            sysFromJO["message"] as Double,
                            sysFromJO["country"] as String,
                            sysFromJO["sunrise"] as Int,
                            sysFromJO["sunset"] as Int
                    )

                    val owmObj = OpenWeatherMapModel (
                            it["base"] as String,
                            it["visibility"] as Int,
                            it["dt"] as Int,
                            it["id"] as Int,
                            it["name"] as String,
                            it["cod"] as Int
                    )

                    ctx.city!!.text = owmObj.name + ", " + sysObj.country
                    ctx.time!!.text = convertTime(owmObj.dt.toLong())      //owmObj.dt.toString()
                    ctx.currentTemp!!.text = mainObj.temp.toString() + "º"
                    ctx.minTemp!!.text = mainObj.tempMin.toString() + "º"
                    ctx.maxTemp!!.text = mainObj.tempMax.toString() + "º"
                    ctx.weatherDescription!!.text = weatherObj.description
                    ctx.pressure!!.text = mainObj.pressure.toString() + " mBar"
                    ctx.humidity!!.text = mainObj.humidity.toString() + " %"
                    ctx.wind!!.text = windObj.speed.toString() + " km/h " + windObj.deg.toString()
                    ctx.sunrise!!.text = convertTime(sysObj.sunrise.toLong())
                    ctx.sunset!!.text = convertTime(sysObj.sunset.toLong())
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

    fun convertTime(time: Long): String {
        val date = Date(time*1000)
        val format = SimpleDateFormat("yyyy MM dd HH:mm:ss")
        return format.format(date)
    }

}








