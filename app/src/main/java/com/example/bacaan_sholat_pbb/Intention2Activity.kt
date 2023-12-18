package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Intention2Activity : AppCompatActivity() {
    private lateinit var Next4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intention2)
        Next4= findViewById(R.id.Next4)

        Next4.setOnClickListener {
            val x = Intent(this@Intention2Activity, Intention3Activity::class.java)
            startActivity(x)
        }
    }
}