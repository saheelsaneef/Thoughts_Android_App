package com.example.adopt_me

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {

    lateinit var usernameInput : EditText;
    lateinit var userPassword : EditText;
    lateinit var loginBtn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.username_input);
        userPassword = findViewById(R.id.user_password);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = userPassword.text.toString()
            Log.i(TAG, "Username:$username and Password:$password ")
        }

    }
}