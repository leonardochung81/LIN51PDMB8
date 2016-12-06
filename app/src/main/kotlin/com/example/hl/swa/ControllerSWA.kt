package com.example.hl.swa

import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.ImageRequest
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_swa_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

class ControllerSWA(val ctx: SwaMainActivity?) : AppCompatActivity() {
    init {    }

    private val TAG = javaClass.simpleName

    val BASE_URL: String = "http://api.openweathermap.org/data/2.5/"
    val BASE_ICON_URL: String = "http://openweathermap.org/img/w/"
    val REQUEST_FORECAST: String = "forecast/daily?id="
    val REQUEST_WEATHER: String = "weather?id="

    val CITY_NAME_COUNTRY_CODE: String = "Lisbon,PT"
    val CITY_ID_LISBON: String = "2267057"

    val PARAM_APPID: String = "&appid="
    val API_ID: String = "2f0a62dfb82d212f34d7a42ab74ef2a6"    // HUGO: bf3a879ca099380c10d7f454e7d540f6   LEO: 2f0a62dfb82d212f34d7a42ab74ef2a6

    val PARAM_UNITS: String = "&units="
    val UNIT_METRIC: String = "metric"

    val PARAM_LIMIT: String = "&cnt="

    var owmWeather: OpenWeatherMapWeatherModel? = null

    val cardinalDirection = arrayOf("N", "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW")

    val iconCode = mapOf(
            Pair("clear sky", "01"),
            Pair("few clouds", "02"),
            Pair("scattered clouds", "03"),
            Pair("broken clouds", "04"),
            Pair("shower rain", "09"),
            Pair("rain", "10"),
            Pair("thunderstorm", "11"),
            Pair("snow", "13"),
            Pair("mist", "50")
    )

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
                            mainFromJO["pressure"] as Int, // (mainFromJO["pressure"] as Int).toDouble(),
                            mainFromJO["humidity"] as Int,
                            mainFromJO["temp_min"] as Int, // (mainFromJO["temp_min"] as Int).toDouble(),
                            mainFromJO["temp_max"] as Int, // (mainFromJO["temp_max"] as Int).toDouble()
                            null /*mainFromJO["seaLevel"] as Double*/,
                            null /*mainFromJO["grdLevel"] as Double*/
                    )

                    val weatherObj = Weather (
                            weatherFromJO["id"] as Int,
                            weatherFromJO["main"] as String,
                            weatherFromJO["description"] as String,
                            weatherFromJO["icon"] as String
                    )

                    var windObj: Wind

                    if (windFromJO.length() == 1)
                        windObj = Wind(windFromJO["speed"] as Double)
                    else
                        windObj = Wind (windFromJO["speed"] as Double, windFromJO["deg"] as Int)

                    val sysObj = Sys (
                            sysFromJO["type"] as Int,
                            sysFromJO["id"] as Int,
                            sysFromJO["message"] as Double,
                            sysFromJO["country"] as String,
                            sysFromJO["sunrise"] as Int,
                            sysFromJO["sunset"] as Int
                    )

                    owmWeather = OpenWeatherMapWeatherModel (
                            it["base"] as String,
                            it["visibility"] as Int,
                            it["dt"] as Int,
                            it["id"] as Int,
                            it["name"] as String,
                            it["cod"] as Int
                    )

                    owmServerRequestIconByDescription(weatherObj.icon)

                    ctx.city!!.text = owmWeather!!.name + ", " + sysObj.country
                    ctx.time!!.text = convertTime(owmWeather!!.dt.toLong())      //owmObj.dt.toString()
                    val temp = DecimalFormat("#.#")
                    ctx.currentTemp!!.text = temp.format(mainObj.temp).toString() + " ºC"
                    ctx.tempMaxMin!!.text =  mainObj.getTempMax().toString() + "º/" + mainObj.getTempMin() + "º"
                    ctx.weatherDescription!!.text = weatherObj.main + ": " + weatherObj.description
                    ctx.pressure!!.text = mainObj.getPressure().toString() + " hpa"    // " mBar"
                    ctx.humidity!!.text = mainObj.humidity.toString() + "%"
                    if (windObj.getDeg() != null)
                        ctx.wind!!.text = windObj.speed.toString() + " km/h - " + degToCompass(windObj.getDeg() as Int) + " (" + windObj.getDeg().toString() + ")"
                    else
                        ctx.wind!!.text = windObj.speed.toString() + " km/h"
                    ctx.sunrise!!.text = convertTime(sysObj.sunrise.toLong()).substring(11)
                    ctx.sunset!!.text = convertTime(sysObj.sunset.toLong()).substring(11)
                },
                {
                    Log.v(TAG, createLogMessage("onErrorResponse"))
//                    println("onResponse: \n" + response.toString())
                })
        )
    }


    private fun owmServerRequestIconByDescription(iconId: String) {
        // EXAMPLE: http://openweathermap.org/img/w/10d.png
        val url = BASE_ICON_URL + iconId + ".png"

        ctx!!.application.requestQueue.add(ImageRequest(url,
                {
                    ctx.weatherIcon.setImageBitmap(it as Bitmap)
                }, 0, 0, null,
                {
                    println("onResponseError: owmServerRequestIconByCode()")
                }
        )
        )
    }

    private fun degToCompass(deg: Int): String {
        val point = ((deg / 22.5) + 0.5).toInt()
        return cardinalDirection[(point % 16)]
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
        val format = SimpleDateFormat("yyyy/MM/dd HH:mm a")
        return format.format(date)
    }

}








