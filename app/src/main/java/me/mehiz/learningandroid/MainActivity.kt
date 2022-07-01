package me.mehiz.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buton = findViewById<Button>(R.id.Clicker)
        val clicks = findViewById<TextView>(R.id.Counter)
        var totalClicks = 0
        buton.setOnClickListener{
            totalClicks++
        clicks.text = totalClicks.toString()
        }
    }
}