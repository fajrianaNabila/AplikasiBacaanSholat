package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bacaan7Activity : AppCompatActivity() {
    private lateinit var Next11: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan7)
        Next11= findViewById(R.id.Next11)

        Next11.setOnClickListener {
            val x = Intent(this@Bacaan7Activity, Bacaan8Activity::class.java)
            startActivity(x)
        }
    }
}