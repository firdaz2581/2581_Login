package com.example.a2581_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etUsername: EditText = findViewById(R.id.et_username)
        val etPassword: EditText = findViewById(R.id.et_password)
        val btnLogin: Button = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isBlank()) {
                etUsername.error = "Username cannot be empty"
                return@setOnClickListener
            }

            if (password.isBlank()) {
                etPassword.error = "Password cannot be empty"
                return@setOnClickListener
            }

            val intent = Intent(this, Dashboard::class.java)
            intent.putExtra("nama", username)
            startActivity(intent)
        }
    }
}