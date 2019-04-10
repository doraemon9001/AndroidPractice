package com.lance.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val word = "MainActivity OnCreact"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtShow = findViewById<TextView>(R.id.txtShow)
        txtShow.setText("test: ${word}")

    }



}
