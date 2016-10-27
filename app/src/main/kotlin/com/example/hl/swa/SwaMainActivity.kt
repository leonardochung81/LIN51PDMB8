package com.example.hl.swa

import android.app.ListActivity
import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.util.Log

class SwaMainActivity : ListActivity() {

    // private ListView presentationListView;

    private val TAG = javaClass.simpleName

    var BASE_URL = "http://api.openweathermap.org/data/2.5/"
    var REQUEST_FORECAST = "forecast/"
    var REQUEST_WEATHER = "weather/"

    var CITY_NAME_COUNTRY_CODE = "Lisbon,PT"
    var CITY_ID_LISBON = "2267057"

    var PARAM_APPID = "&appid="
    var API_ID = "2f0a62dfb82d212f34d7a42ab74ef2a6"    // HUGO: bf3a879ca099380c10d7f454e7d540f6   LEO: 2f0a62dfb82d212f34d7a42ab74ef2a6

    var PARAM_UNIT = "&unit="
    var UNIT_METRIC = "metric"

    var PARAM_LIMIT = "&cnt="


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.v(TAG, createLogMessage("onStart"))


        setContentView(R.layout.activity_swa_main)


        if (savedInstanceState != null) {   // se tiver info no bundle




        } else {    // se não tiver info no bundle
            // ver no sharedPreferences se tem info
            // ...

            if (isNetworkAvailable() /*&& passou1h?*/) {



            } else {    // verificar se há dados na estrutura
                // se SIM load de dados



                // se NÃO não faz nada e avisa que não há conexão


            }
        }
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
