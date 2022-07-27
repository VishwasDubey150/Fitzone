package com.example.fitzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val frame:FrameLayout =findViewById(R.id.frame)
        frame.setOnClickListener {
            val intent=Intent(this,Exercise_Activity::class.java)
            startActivity(intent)
        }
    }
}