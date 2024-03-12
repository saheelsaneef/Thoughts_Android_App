package com.example.adopt_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        val submitButtone = findViewById<Button>(R.id.submit_button)
        submitButtone.setOnClickListener {
            val intent = Intent(this, feed::class.java)
            startActivity(intent)

        }

        val backBtn = findViewById<FloatingActionButton>(R.id.fab_crt)
        backBtn.setOnClickListener {
            val intent = Intent(this,feed::class.java)
            startActivity(intent)
        }
    }
}