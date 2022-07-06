package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {

    lateinit var Phone :EditText
    lateinit var Pswd :EditText
    lateinit var btnClick : Button
    lateinit var  forgotPswd: TextView
    lateinit var  Register: TextView
    val validMobileNumber="1110001110"
    val validPassword= arrayOf("tony","steve","hulk","thanos")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title="Login"

        Phone=findViewById(R.id.Phone)
        Pswd=findViewById(R.id.Pswd)
        btnClick=findViewById(R.id.btnClick)
        forgotPswd=findViewById(R.id.forgotPswd)
        Register=findViewById(R.id.Register)


        btnClick.setOnClickListener{
            val mobileNumber=Phone.text.toString()
            val password=Pswd.text.toString()
            var nameOfAvenger="Avenger"
            val intent= Intent(this@MainActivity3,MainActivity::class.java)
            if((mobileNumber==validMobileNumber)){
                if(password==validPassword[0])
                {
                    nameOfAvenger="Iron Man"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }
                else if(password==validPassword[1])
                {
                    nameOfAvenger="Captain America"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }
                else if(password==validPassword[2])
                {
                    nameOfAvenger="The Hulk"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }
                else if(password==validPassword[3])
                {
                    nameOfAvenger="The Avengers"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }

            }
            else{
                Toast.makeText(
                    this@MainActivity3,
                    "Incorrect Credentials",
                    Toast.LENGTH_LONG
                ).show()  //this is known as lambda reprsentation

            }

        }
    }


}