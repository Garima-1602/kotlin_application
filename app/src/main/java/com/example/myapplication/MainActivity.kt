package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) //we use it to save the instance state of an activity
    //to transfer the data from one screen to another we need bundles
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}