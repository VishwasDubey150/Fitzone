package com.example.fitzone
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Exercise_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        supportActionBar?.hide()
    }
}