package com.example.hl.swa

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_swa_main.*

class SwaMainActivity : AppCompatActivity() {

    // private ListView presentationListView;

    private val TAG = javaClass.simpleName
    private val controller = ControllerSWA(this)

//    var BASE_URL = "http://api.openweathermap.org/data/2.5/"
//    var REQUEST_FORECAST = "forecast/"
//    var REQUEST_WEATHER = "weather/"
//
//    var CITY_NAME_COUNTRY_CODE = "Lisbon,PT"
    val CITY_ID_LISBON: String = "2267057"
    private val KEY_CITY_ID = "CityId"
//    var PARAM_APPID = "&appid="
//    var API_ID = "2f0a62dfb82d212f34d7a42ab74ef2a6"    // HUGO: bf3a879ca099380c10d7f454e7d540f6   LEO: 2f0a62dfb82d212f34d7a42ab74ef2a6
//
//    var PARAM_UNITS = "&units="
//    var UNIT_METRIC = "metric"
//
//    var PARAM_LIMIT = "&cnt="


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swa_main)

        Log.v(TAG, createLogMessage("onStart"))

        // forecast BUTTON TODO
        forecastButton!!.setOnClickListener {
            val intentSwa: Intent = Intent(this@SwaMainActivity, SwaForecastActivity::class.java)

            intentSwa.putExtra(KEY_CITY_ID, CITY_ID_LISBON)

            startActivity(intentSwa)
        }

        if (savedInstanceState != null) {   // se tiver info no bundle


        } else {    // se não tiver info no bundle
            // ver no sharedPreferences se tem info
            // ...

            if (isNetworkAvailable() /*&& passou1h?*/) {
//                Log.v(TAG, createLogMessage("makeRequest"))
                controller.owmServerRequestWeatherByCityCode(CITY_ID_LISBON)


            } else {    // verificar se há dados na estrutura
                // se SIM load de dados



                // se NÃO não faz nada e avisa que não há conexão


            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item?.itemId

        when (id) {
            R.id.refreshButton -> {
                //do REFRESH
                return true
            }

            R.id.aboutButton -> {
                //show ABOUT
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }





    /**********************************************
     *
     *              StartActivity Methods
     *
     **********************************************/

    private fun isNetworkAvailable(): Boolean {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo

        // if no network is available networkInfo will be null
        // otherwise check if we are connected
        return networkInfo != null && networkInfo.isConnected
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
