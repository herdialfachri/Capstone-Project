package com.example.projectlatihan

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvId = findViewById<TextView>(R.id.tvId)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)

        val id = intent.getIntExtra("id", 0)
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")

        tvId.text = "ID: $id"
        tvName.text = "Name: $name"
        tvEmail.text = "Email: $email"
    }
}