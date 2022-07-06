package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() , View.OnClickListener {
    //to widen the scope we have declare them before the override
    override fun onClick(p0: View?) {
     Toast.makeText(this@MainActivity3,"We clicked on the button to see toast",
         Toast.LENGTH_LONG).show()
    }
    lateinit var Phone :EditText
    lateinit var Pswd :EditText
    lateinit var btnClick : Button
    lateinit var  forgotPswd: TextView
    lateinit var  Register: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title="Login"

        Phone=findViewById(R.id.Phone)
        Pswd=findViewById(R.id.Pswd)
        btnClick=findViewById(R.id.btnClick)
        forgotPswd=findViewById(R.id.forgotPswd)
        Register=findViewById(R.id.Register)

        btnClick.setOnClickListener(this)
    }


}