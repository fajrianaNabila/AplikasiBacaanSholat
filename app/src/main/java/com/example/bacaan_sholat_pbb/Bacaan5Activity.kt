package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bacaan5Activity : AppCompatActivity() {
    private lateinit var Next9: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan5)
        Next9= findViewById(R.id.Next9)

        Next9.setOnClickListener {
            val x = Intent(this@Bacaan5Activity, Bacaan6Activity::class.java)
            startActivity(x)
        }
    }
}