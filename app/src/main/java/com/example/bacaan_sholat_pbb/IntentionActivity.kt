package com.example.bacaan_sholat_pbb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentionActivity : AppCompatActivity() {
    private lateinit var Next2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intention)
        Next2= findViewById(R.id.Next2)

        Next2.setOnClickListener {
            val x = Intent(this@IntentionActivity, Intention2Activity::class.java)
            startActivity(x)
        }
    }
}