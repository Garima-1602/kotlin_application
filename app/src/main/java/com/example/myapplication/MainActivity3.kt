package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    //to widen the scope we have declare them before the override
    lateinit var Phone :EditText
    lateinit var Pswd :EditText
    lateinit var btnClick : Button
    lateinit var  forgotPswd: TextView
    lateinit var  Register: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title="Login"
    }
}