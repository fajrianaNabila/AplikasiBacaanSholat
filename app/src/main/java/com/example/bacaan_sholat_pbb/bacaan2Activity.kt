package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bacaan2Activity : AppCompatActivity() {
    private lateinit  var Next6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan2)
        Next6= findViewById(R.id.Next6)

        Next6.setOnClickListener {
            val x = Intent(this@bacaan2Activity, Bacaan3Activity::class.java)
            startActivity(x)
        }
    }
}