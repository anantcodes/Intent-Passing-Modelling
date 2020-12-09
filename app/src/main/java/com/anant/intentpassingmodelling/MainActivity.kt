package com.anant.intentpassingmodelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var etUsername:EditText
    lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername=findViewById(R.id.etUsername)
        etPassword=findViewById(R.id.etPassword)
        



    }
}