package com.example.adopt_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        val submitButtone = findViewById<Button>(R.id.submit_button)
        submitButtone.setOnClickListener {
            val intent = Intent(this, feed::class.java)
            startActivity(intent)

        }
    }
}