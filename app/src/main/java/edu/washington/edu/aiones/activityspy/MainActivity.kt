package edu.washington.edu.aiones.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    val TAG = "activityspy"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"onCreate event fired")
    }

    override fun onDestroy() {
        Log.e(TAG, "We’re going down, Captain!")
        super.onDestroy()

    }
}
