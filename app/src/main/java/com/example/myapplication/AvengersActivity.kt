package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AvengersActivity : AppCompatActivity() {
    var titleName:String?="Avengers"
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) //we use it to save the instance state of an activity
    //to transfer the data from one screen to another we need bundles
    {
        super.onCreate(savedInstanceState)
        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        //activity main to provide UI of app
        setContentView(R.layout.activity_avengers) // R is an automated file generated in android
        //println("onCreate called")
       // if(intent!=null){
       // titleName=intent.getStringExtra("Name")}
        titleName=sharedPreferences.getString("Title","The Avengers")
        title = titleName
    }


}