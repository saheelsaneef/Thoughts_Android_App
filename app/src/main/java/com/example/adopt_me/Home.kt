package com.example.adopt_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView


class Home : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.feed -> {
                    val intent = Intent (this,feed::class.java)
                    startActivity(intent)
                    true
                }
                R.id.categoryy -> {
                    val intent = Intent(this, categoryy::class.java)
                    startActivity(intent)
                    true
                }
                R.id.favourite -> {
                    val intent = Intent(this, favourite::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    val intent = Intent(this, profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }



    }
}