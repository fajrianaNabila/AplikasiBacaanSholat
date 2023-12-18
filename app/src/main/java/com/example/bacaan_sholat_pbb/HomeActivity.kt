package com.example.bacaan_sholat_pbb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        button3= findViewById(R.id.button3)
        button4= findViewById(R.id.button4)
        button5= findViewById(R.id.button5)
        button6= findViewById(R.id.button6)
        button7= findViewById(R.id.button7)

        button3.setOnClickListener{
            val x = Intent(this@HomeActivity, TimeActivity::class.java)
            startActivity(x)
        }
        button4.setOnClickListener{
            val x = Intent(this@HomeActivity, IntentionActivity::class.java)
            startActivity(x)
        }
        button5.setOnClickListener{
            val x = Intent(this@HomeActivity, bacaanActivity::class.java)
            startActivity(x)
        }
        button6.setOnClickListener{
            val x = Intent(this@HomeActivity, TutorialActivity::class.java)
            startActivity(x)
        }
        button7.setOnClickListener{
            val x = Intent(this@HomeActivity, AkunActivity::class.java)
            startActivity(x)
        }

    }
}
