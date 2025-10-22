package com.example.a2581_login

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val tv_ucapan: TextView = findViewById(R.id.tv_ucapan)

        val username = intent.getStringExtra("nama")

        tv_ucapan.text = "Selamat Datang! $username"

    }
}
