package com.example.imad5112testassessment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailedViewScreeen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screeen)
        val monday = findViewById<TextView>(R.id.textMon)
        val tuesday = findViewById<TextView>(R.id.textTues)
        val wednesday = findViewById<TextView>(R.id.textWed)
        val thursday = findViewById<TextView>(R.id.textThurs)
        val friday = findViewById<TextView>(R.id.textFri)
        val generate = findViewById<Button>(R.id.buttonGen)

        generate?.setOnClickListener {
            val monday = 20
            val tuesady = 30
            val wednesday = 23
            val thursday = 19
            val friday = 14

        }



    }
}