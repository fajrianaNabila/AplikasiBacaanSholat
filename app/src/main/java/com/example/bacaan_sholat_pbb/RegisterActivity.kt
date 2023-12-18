package com.example.bacaan_sholat_pbb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var nameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var rePasswordEditText: EditText
    private lateinit var registerButton: Button

    fun onSuksesRegister(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        // Selesaikan aktivitas saat ini agar tidak bisa kembali lagi
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
    }
}
