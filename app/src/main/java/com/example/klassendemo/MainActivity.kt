package com.example.klassendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val u712 = Users("Tom", "Game", 29)
        Log.i("Test", "${u712.gibName()}")

        val u713 = Users("Thomas")
        Log.i("Test", "${u713.gibName()}")
    }
}