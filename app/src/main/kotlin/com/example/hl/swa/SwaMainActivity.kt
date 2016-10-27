package com.example.hl.swa

import android.app.ListActivity
import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.util.Log

class SwaMainActivity : ListActivity() {

    // private ListView presentationListView;

    private val TAG = javaClass.simpleName

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
