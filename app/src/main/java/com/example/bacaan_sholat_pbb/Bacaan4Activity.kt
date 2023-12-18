package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bacaan4Activity : AppCompatActivity() {
    private lateinit var Next8: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan4)
        Next8= findViewById(R.id.Next8)

        Next8.setOnClickListener {
            val x = Intent(this@Bacaan4Activity, Bacaan5Activity::class.java)
            startActivity(x)
        }

    }
}