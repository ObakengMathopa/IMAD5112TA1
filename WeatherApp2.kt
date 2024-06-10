package com.example.imad5112testassessment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class WeatherApp2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_app2)
        val nextButton = findViewById<Button>(R.id.button4)
        val generateButton = findViewById<Button>(R.id.button5)

        generateButton?.setOnClickListener {
           var weekOne = "Week One Temp Avg = 23"
            var txtTwo = "Week Two Temp Avg = 19"
            var txtThree = "Week Three Temp Avg = 14"

        nextButton?.setOnClickListener {
            val intent = Intent(this,DetailedViewScreeen::class.java)
                startActivity(Intent())

        }





        }
    }
}






