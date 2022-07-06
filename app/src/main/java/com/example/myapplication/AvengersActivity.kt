package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AvengersActivity : AppCompatActivity() {
    var titleName:String?="Avengers"
    override fun onCreate(savedInstanceState: Bundle?) //we use it to save the instance state of an activity
    //to transfer the data from one screen to another we need bundles
    {
        super.onCreate(savedInstanceState)
        //activity main to provide UI of app
        setContentView(R.layout.activity_avengers) // R is an automated file generated in android
        //println("onCreate called")
        if(intent!=null){
        titleName=intent.getStringExtra("Name")}
        title = titleName
    }


}