//-----------------------------------com.example.City.java-----------------------------------

package com.example.hl.swa

import java.util.ArrayList
import java.util.HashMap

//@Generated("org.jsonschema2pojo")
class City {

    /*

     * @return
     * * The id
     */
    /*
     * @param id
     * * The id
     */
    var id: Int? = null
    /*

     * @return
     * * The name
     */
    /*

     * @param name
     * * The name
     */
    var name: String? = null
    /*

     * @return
     * * The coord
     */
    /*

     * @param coord
     * * The coord
     */
    var coord: Coord? = null
    /*

     * @return
     * * The country
     */
    /*

     * @param country
     * * The country
     */
    var country: String? = null
    /*

     * @return
     * * The population
     */
    /*

     * @param population
     * * The population
     */
    var population: Int? = null
    /*

     * @return
     * * The sys
     */
    /*

     * @param sys
     * * The sys
     */
    var sys: Sys? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.Clouds.java-----------------------------------


//@Generated("org.jsonschema2pojo")
class Clouds {

    /*

     * @return
     * * The all
     */
    /*

     * @param all
     * * The all
     */
    var all: Int? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.Coord.java-----------------------------------


//@Generated("org.jsonschema2pojo")
class Coord {

    /*

     * @return
     * * The lon
     */
    /*

     * @param lon
     * * The lon
     */
    var lon: Double? = null
    /*

     * @return
     * * The lat
     */
    /*

     * @param lat
     * * The lat
     */
    var lat: Double? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.List.java-----------------------------------


////@Generated("org.jsonschema2pojo")
class List {

    /*

     * @return
     * * The dt
     */
    /*

     * @param dt
     * * The dt
     */
    var dt: Int? = null
    /*

     * @return
     * * The main
     */
    /*

     * @param main
     * * The main
     */
    var main: Main? = null
    /*

     * @return
     * * The weather
     */
    /*

     * @param weather
     * * The weather
     */
    var weather = ArrayList<Weather>()
    /*

     * @return
     * * The clouds
     */
    /*

     * @param clouds
     * * The clouds
     */
    var clouds: Clouds? = null
    /*

     * @return
     * * The wind
     */
    /*

     * @param wind
     * * The wind
     */
    var wind: Wind? = null
    /*

     * @return
     * * The sys
     */
    /*

     * @param sys
     * * The sys
     */
    var sys: Sys_? = null
    /*

     * @return
     * * The dtTxt
     */
    /*

     * @param dtTxt
     * * The dt_txt
     */
    var dtTxt: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.Main.java-----------------------------------


////@Generated("org.jsonschema2pojo")
class Main {

    /*

     * @return
     * * The temp
     */
    /*

     * @param temp
     * * The temp
     */
    var temp: Double? = null
    /*

     * @return
     * * The tempMin
     */
    /*

     * @param tempMin
     * * The temp_min
     */
    var tempMin: Double? = null
    /*

     * @return
     * * The tempMax
     */
    /*

     * @param tempMax
     * * The temp_max
     */
    var tempMax: Double? = null
    /*

     * @return
     * * The pressure
     */
    /*

     * @param pressure
     * * The pressure
     */
    var pressure: Double? = null
    /*

     * @return
     * * The seaLevel
     */
    /*

     * @param seaLevel
     * * The sea_level
     */
    var seaLevel: Double? = null
    /*

     * @return
     * * The grndLevel
     */
    /*

     * @param grndLevel
     * * The grnd_level
     */
    var grndLevel: Double? = null
    /*

     * @return
     * * The humidity
     */
    /*

     * @param humidity
     * * The humidity
     */
    var humidity: Int? = null
    /*

     * @return
     * * The tempKf
     */
    /*

     * @param tempKf
     * * The temp_kf
     */
    var tempKf: Int? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.OpenWeatherMapForecastModel.java-----------------------------------


//@Generated("org.jsonschema2pojo")
class OpenWeatherMapForecastModel {

    /*

     * @return
     * * The city
     */
    /*

     * @param city
     * * The city
     */
    var city: City? = null
    /*

     * @return
     * * The cod
     */
    /*

     * @param cod
     * * The cod
     */
    var cod: String? = null
    /*

     * @return
     * * The message
     */
    /*

     * @param message
     * * The message
     */
    var message: Double? = null
    /*

     * @return
     * * The cnt
     */
    /*

     * @param cnt
     * * The cnt
     */
    var cnt: Int? = null
    /*

     * @return
     * * The list
     */
    /*

     * @param list
     * * The list
     */
    var list = ArrayList<List>()
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.Sys.java-----------------------------------


//@Generated("org.jsonschema2pojo")
class Sys {

    /*

     * @return
     * * The population
     */
    /*

     * @param population
     * * The population
     */
    var population: Int? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.Sys_.java-----------------------------------


//@Generated("org.jsonschema2pojo")
class Sys_ {

    /*

     * @return
     * * The pod
     */
    /*

     * @param pod
     * * The pod
     */
    var pod: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.Weather.java-----------------------------------


//@Generated("org.jsonschema2pojo")
class Weather {

    /*

     * @return
     * * The id
     */
    /*

     * @param id
     * * The id
     */
    var id: Int? = null
    /*

     * @return
     * * The main
     */
    /*

     * @param main
     * * The main
     */
    var main: String? = null
    /*

     * @return
     * * The description
     */
    /*

     * @param description
     * * The description
     */
    var description: String? = null
    /*

     * @return
     * * The icon
     */
    /*

     * @param icon
     * * The icon
     */
    var icon: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
//-----------------------------------com.example.Wind.java-----------------------------------


//@Generated("org.jsonschema2pojo")
class Wind {

    /*

     * @return
     * * The speed
     */
    /*

     * @param speed
     * * The speed
     */
    var speed: Double? = null
    /*

     * @return
     * * The deg
     */
    /*

     * @param deg
     * * The deg
     */
    var deg: Double? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}
