package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bacaan3Activity : AppCompatActivity() {
    private lateinit var Next7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan3)
        Next7= findViewById(R.id.Next7)

        Next7.setOnClickListener {
            val x = Intent(this@Bacaan3Activity, Bacaan4Activity::class.java)
            startActivity(x)
        }

    }
}