package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bacaan6Activity : AppCompatActivity() {
    private lateinit var Next10: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan6)
        Next10= findViewById(R.id.Next10)

        Next10.setOnClickListener {
            val x = Intent(this@Bacaan6Activity, Bacaan7Activity::class.java)
            startActivity(x)
        }

    }
}