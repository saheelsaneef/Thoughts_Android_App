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
                R.id.home -> {
                    true
                }
                R.id.category -> {

                    val intent = Intent(this, Category::class.java)
                    startActivity(intent)
                    true
                }
                R.id.favourite -> {

                    val intent = Intent(this, Favourite::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    // Handle profile item click (launch the profile activity)
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }
}