package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bacaanActivity : AppCompatActivity() {
    private lateinit var Next5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan)
        Next5= findViewById(R.id.Next5)

        Next5.setOnClickListener {
            val x = Intent(this@bacaanActivity, bacaan2Activity::class.java)
            startActivity(x)
        }

    }
}