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

data class Main
(
        val temp: Double,
        val pressure: Double,
        val humidity: Int,
        val tempMin: Double,
        val tempMax: Double,
        val seaLevel: Double?,
        val grndLevel: Double?
)


data class OpenWeatherMapModel
(
//    val coord: Coord?,
//    val weather = Weather?,
    val base: String,
    val visibility: Int,
//    val main: Main?,
//    val wind: Wind?,
//    val rain: Rain?,
//    val clouds: Clouds?,
    val dt: Int,
//    val sys: Sys?,
    val id: Int,
    val name: String,
    val cod: Int
)

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
    val main: String?,
    val description: String?,
    val icon: String?
)

data class Wind
(
    val speed: Double?,
    val deg: Double?
)

//-----------------------------------com.example.hl.swa.Coord.java//-----------------------------------
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
