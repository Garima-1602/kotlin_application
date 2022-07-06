package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var Phone :EditText
    lateinit var Pswd :EditText
    lateinit var btnClick : Button
    lateinit var  forgotPswd: TextView
    lateinit var  Register: TextView
    val validMobileNumber="1110001110"
    val validPassword= arrayOf("tony","steve","hulk","thanos")
    lateinit var sharedPreferences:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        val isLoggedIn=sharedPreferences.getBoolean("isLoggedIn",false)
        if(isLoggedIn)
        {
            val intent= Intent(this@LoginActivity,AvengersActivity::class.java)
            startActivity(intent)
        }
        else
        {
            setContentView(R.layout.activity_main2)
        }

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
            val intent= Intent(this@LoginActivity,AvengersActivity::class.java)
            if((mobileNumber==validMobileNumber)){
                //using when syntax like
                    //when(password)
                        //validpassword[0]-> {condiiton}
                if(password==validPassword[0])
                {
                    savePreferences()
                    nameOfAvenger="Iron Man"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }
                else if(password==validPassword[1])
                {
                    savePreferences()
                    nameOfAvenger="Captain America"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }
                else if(password==validPassword[2])
                {
                    savePreferences()
                    nameOfAvenger="The Hulk"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }
                else if(password==validPassword[3])
                {
                    savePreferences()
                    nameOfAvenger="The Avengers"
                    intent.putExtra("Name",nameOfAvenger)
                    startActivity(intent)
                }

            }
            else{
                Toast.makeText(
                    this@LoginActivity,
                    "Incorrect Credentials",
                    Toast.LENGTH_LONG
                ).show()  //this is known as lambda reprsentation

            }

        }
    }
//so that when we return back to the activity from avengers there is no login credential
    override fun onPause() {
        super.onPause()
        finish()
    }
    fun savePreferences()
    {
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
    }

}