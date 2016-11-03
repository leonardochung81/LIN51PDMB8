//-----------------------------------com.example.hl.swa.Clouds.java//-----------------------------------

package com.example.hl.swa

import java.util.*

//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
class Clouds {

    //@JsonProperty("all")
    /**

     * //@return
     * The all
     */
    //@JsonProperty("all")
    /**

     * //@param all
     * The all
     */
    //@JsonProperty("all")
    var all: Int? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}

class Coord {

    //@JsonProperty("lon")
    /**

     * //@return
     * The lon
     */
    //@JsonProperty("lon")
    /**

     * //@param lon
     * The lon
     */
    //@JsonProperty("lon")
    var lon: Double? = null
    //@JsonProperty("lat")
    /**

     * //@return
     * The lat
     */
    //@JsonProperty("lat")
    /**

     * //@param lat
     * The lat
     */
    //@JsonProperty("lat")
    var lat: Double? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}

class Main {

    //@JsonProperty("temp")
    /**

     * //@return
     * The temp
     */
    //@JsonProperty("temp")
    /**

     * //@param temp
     * The temp
     */
    //@JsonProperty("temp")
    var temp: Double? = null
    //@JsonProperty("pressure")
    /**

     * //@return
     * The pressure
     */
    //@JsonProperty("pressure")
    /**

     * //@param pressure
     * The pressure
     */
    //@JsonProperty("pressure")
    var pressure: Double? = null
    //@JsonProperty("humidity")
    /**

     * //@return
     * The humidity
     */
    //@JsonProperty("humidity")
    /**

     * //@param humidity
     * The humidity
     */
    //@JsonProperty("humidity")
    var humidity: Int? = null
    //@JsonProperty("temp_min")
    /**

     * //@return
     * The tempMin
     */
    //@JsonProperty("temp_min")
    /**

     * //@param tempMin
     * The temp_min
     */
    //@JsonProperty("temp_min")
    var tempMin: Double? = null
    //@JsonProperty("temp_max")
    /**

     * //@return
     * The tempMax
     */
    //@JsonProperty("temp_max")
    /**

     * //@param tempMax
     * The temp_max
     */
    //@JsonProperty("temp_max")
    var tempMax: Double? = null
    //@JsonProperty("sea_level")
    /**

     * //@return
     * The seaLevel
     */
    //@JsonProperty("sea_level")
    /**

     * //@param seaLevel
     * The sea_level
     */
    //@JsonProperty("sea_level")
    var seaLevel: Double? = null
    //@JsonProperty("grnd_level")
    /**

     * //@return
     * The grndLevel
     */
    //@JsonProperty("grnd_level")
    /**

     * //@param grndLevel
     * The grnd_level
     */
    //@JsonProperty("grnd_level")
    var grndLevel: Double? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}

class OpenWeatherMapModel {

    //@JsonProperty("coord")
    /**

     * //@return
     * The coord
     */
    //@JsonProperty("coord")
    /**

     * //@param coord
     * The coord
     */
    //@JsonProperty("coord")
    var coord: Coord? = null
    //@JsonProperty("weather")
    /**

     * //@return
     * The weather
     */
    //@JsonProperty("weather")
    /**

     * //@param weather
     * The weather
     */
    //@JsonProperty("weather")
    var weather = ArrayList<Weather>()
    //@JsonProperty("base")
    /**

     * //@return
     * The base
     */
    //@JsonProperty("base")
    /**

     * //@param base
     * The base
     */
    //@JsonProperty("base")
    var base: String? = null
    //@JsonProperty("main")
    /**

     * //@return
     * The main
     */
    //@JsonProperty("main")
    /**

     * //@param main
     * The main
     */
    //@JsonProperty("main")
    var main: Main? = null
    //@JsonProperty("wind")
    /**

     * //@return
     * The wind
     */
    //@JsonProperty("wind")
    /**

     * //@param wind
     * The wind
     */
    //@JsonProperty("wind")
    var wind: Wind? = null
    //@JsonProperty("rain")
    /**

     * //@return
     * The rain
     */
    //@JsonProperty("rain")
    /**

     * //@param rain
     * The rain
     */
    //@JsonProperty("rain")
    var rain: Rain? = null
    //@JsonProperty("clouds")
    /**

     * //@return
     * The clouds
     */
    //@JsonProperty("clouds")
    /**

     * //@param clouds
     * The clouds
     */
    //@JsonProperty("clouds")
    var clouds: Clouds? = null
    //@JsonProperty("dt")
    /**

     * //@return
     * The dt
     */
    //@JsonProperty("dt")
    /**

     * //@param dt
     * The dt
     */
    //@JsonProperty("dt")
    var dt: Int? = null
    //@JsonProperty("sys")
    /**

     * //@return
     * The sys
     */
    //@JsonProperty("sys")
    /**

     * //@param sys
     * The sys
     */
    //@JsonProperty("sys")
    var sys: Sys? = null
    //@JsonProperty("id")
    /**

     * //@return
     * The id
     */
    //@JsonProperty("id")
    /**

     * //@param id
     * The id
     */
    //@JsonProperty("id")
    var id: Int? = null
    //@JsonProperty("name")
    /**

     * //@return
     * The name
     */
    //@JsonProperty("name")
    /**

     * //@param name
     * The name
     */
    //@JsonProperty("name")
    var name: String? = null
    //@JsonProperty("cod")
    /**

     * //@return
     * The cod
     */
    //@JsonProperty("cod")
    /**

     * //@param cod
     * The cod
     */
    //@JsonProperty("cod")
    var cod: Int? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}

class Rain {

    //@JsonProperty("3h")
    /**

     * //@return
     * The _3h
     */
    //@JsonProperty("3h")
    /**

     * //@param _3h
     * The 3h
     */
    //@JsonProperty("3h")
    var treeh:Double? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}

class Sys {

    //@JsonProperty("message")
    /**

     * //@return
     * The message
     */
    //@JsonProperty("message")
    /**

     * //@param message
     * The message
     */
    //@JsonProperty("message")
    var message: Double? = null
    //@JsonProperty("country")
    /**

     * //@return
     * The country
     */
    //@JsonProperty("country")
    /**

     * //@param country
     * The country
     */
    //@JsonProperty("country")
    var country: String? = null
    //@JsonProperty("sunrise")
    /**

     * //@return
     * The sunrise
     */
    //@JsonProperty("sunrise")
    /**

     * //@param sunrise
     * The sunrise
     */
    //@JsonProperty("sunrise")
    var sunrise: Int? = null
    //@JsonProperty("sunset")
    /**

     * //@return
     * The sunset
     */
    //@JsonProperty("sunset")
    /**

     * //@param sunset
     * The sunset
     */
    //@JsonProperty("sunset")
    var sunset: Int? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}

class Weather {

    //@JsonProperty("id")
    /**

     * //@return
     * The id
     */
    //@JsonProperty("id")
    /**

     * //@param id
     * The id
     */
    //@JsonProperty("id")
    var id: Int? = null
    //@JsonProperty("main")
    /**

     * //@return
     * The main
     */
    //@JsonProperty("main")
    /**

     * //@param main
     * The main
     */
    //@JsonProperty("main")
    var main: String? = null
    //@JsonProperty("description")
    /**

     * //@return
     * The description
     */
    //@JsonProperty("description")
    /**

     * //@param description
     * The description
     */
    //@JsonProperty("description")
    var description: String? = null
    //@JsonProperty("icon")
    /**

     * //@return
     * The icon
     */
    //@JsonProperty("icon")
    /**

     * //@param icon
     * The icon
     */
    //@JsonProperty("icon")
    var icon: String? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}

class Wind {

    //@JsonProperty("speed")
    /**

     * //@return
     * The speed
     */
    //@JsonProperty("speed")
    /**

     * //@param speed
     * The speed
     */
    //@JsonProperty("speed")
    var speed: Double? = null
    //@JsonProperty("deg")
    /**

     * //@return
     * The deg
     */
    //@JsonProperty("deg")
    /**

     * //@param deg
     * The deg
     */
    //@JsonProperty("deg")
    var deg: Double? = null
    //@JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    //@JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    //@JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties.put(name, value)
    }

}//-----------------------------------com.example.hl.swa.Coord.java//-----------------------------------
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
//-----------------------------------com.example.hl.swa.Main.java//-----------------------------------
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
//-----------------------------------com.example.hl.swa.OpenWeatherMapModel.java//-----------------------------------
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
//-----------------------------------com.example.hl.swa.Rain.java//-----------------------------------
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
//-----------------------------------com.example.hl.swa.Sys.java//-----------------------------------
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
//-----------------------------------com.example.hl.swa.Weather.java//-----------------------------------
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
//-----------------------------------com.example.hl.swa.Wind.java//-----------------------------------
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
