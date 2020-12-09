package com.anant.intentpassingmodelling

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    lateinit var etUsername:EditText
    lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername=findViewById(R.id.etUsername)
        etPassword=findViewById(R.id.etPassword)

        val intent = Intent(this, ShowActivity::class.java)

//attach the key value pair using putExtra to this intent

//attach the key value pair using putExtra to this intent
        val user_name = "Jhon Doe"
        intent.putExtra("USER_NAME", user_name)

//starting the activity

//starting the activity
        startActivity(intent)



    }
}