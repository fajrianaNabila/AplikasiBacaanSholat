package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TimeActivity : AppCompatActivity() {
    private lateinit var Next1: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        Next1= findViewById(R.id.Next1)

        Next1.setOnClickListener {
            val x = Intent(this@TimeActivity, Time2Activity::class.java)
            startActivity(x)
        }

    }
}