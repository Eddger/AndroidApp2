package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<TextView>(R.id.usertxt)
        val password = findViewById<TextView>(R.id.passtxt)
        val button = findViewById<Button>(R.id.lg_btn)

        button.setOnClickListener {
            if (username.text.toString() == "Dan" && password.text.toString() == "dan12") {
                Toast.makeText(this, "You have successfully login in", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            } else if (username.text.toString() != "Dan" || password.text.toString() != "dan12") {
                Toast.makeText(this, "Incorrect username or password", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}