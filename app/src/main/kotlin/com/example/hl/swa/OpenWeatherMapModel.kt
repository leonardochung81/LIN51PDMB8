//-----------------------------------com.example.hl.swa.Clouds.java//-----------------------------------

package com.example.hl.swa

data class Clouds (val all: Int)

data class Coord(val lon: Double, val lat: Double)

data class Main(val temp: Double, val humidity: Int, val seaLevel: Double?, val grndLevel: Double?) {   // Primary Constructor
    // propriedades FORECAST
    private var pressureForecast: Double? = null
    private var tempMinForecast: Double? = null
    private var tempMaxForecast: Double? = null

    // propriedades WEATHER
    private var pressureWeather: Int? = null
    private var tempMinWeather: Int? = null
    private var tempMaxWeather: Int? = null

    // Secondary Constructor Forecast
    constructor (
            temp: Double,
            pressure: Double,
            humidity: Int,
            tempMin: Double,
            tempMax: Double,
            seaLevel: Double?,
            grndLevel: Double?
    ) : this(temp, humidity, seaLevel, grndLevel) {
        pressureForecast = pressure
        tempMinForecast = tempMin
        tempMaxForecast = tempMax
    }

    // Constructor Weather
    constructor (
            temp: Double,
            pressure: Int,
            humidity: Int,
            tempMin: Int,
            tempMax: Int,
            seaLevel: Double?,
            grndLevel: Double?
    ) : this(temp, humidity, seaLevel, grndLevel) {
        pressureWeather = pressure
        tempMinWeather = tempMin
        tempMaxWeather = tempMax
    }

    fun getPressure() = if (pressureForecast != null) pressureForecast else pressureWeather

    fun getTempMin() = if (tempMinForecast != null) tempMinForecast else tempMinWeather

    fun getTempMax() = if (tempMaxForecast != null) tempMaxForecast else tempMaxWeather
}


data class OpenWeatherMapWeatherModel
(
        // propriedades tipo objectos
//        val coord: Coord?,
//        val weather: Weather?,
//        val main: Main?,
//        val wind: Wind?,
//        val rain: Rain?,
//        val clouds: Clouds?,
//        val sys: Sys?,

        // propriedades tipos basicos
        val base: String,
        val visibility: Int,
        val dt: Int,
        val id: Int,
        val name: String,
        val cod: Int
)

//data class OpenWeatherMapForecastModel
//(
//        // propriedades tipo objectos
//        val coord: Coord?,
//        val weather: Weather?,
//        val main: Main?,
//        val wind: Wind?,
//        val rain: Rain?,
//        val clouds: Clouds?,
//        val sys: Sys?,
//
//        // propriedades tipos basicos
//        val base: String,
//        val visibility: Int,
//        val dt: Int,
//        val id: Int,
//        val name: String,
//        val cod: Int
//)

data class Rain (val threeH:Double)  //@JsonProperty("3h")

data class Sys
(
    val type: Int,
    val id:  Int,
    val message: Double,
    val country: String,
    val sunrise: Int,
    val sunset: Int
)

data class Weather
(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

data class Wind (val speed: Double) {   //    val deg: Double?
    private var degForecast: Double? = null
    private var degWeather: Int? = null

    constructor (speed: Double, deg: Double): this(speed) { degForecast = deg }

    constructor (speed: Double, deg: Int): this(speed) { degWeather = deg }

    fun getDeg() = if (degForecast != null) degForecast else degWeather
}
