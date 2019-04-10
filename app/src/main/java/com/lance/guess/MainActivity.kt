package com.lance.guess

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val word = "MainActivity OnCreact"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = findViewById<TextView>(R.id.txtShow)
//        val bt_submit = findViewById<Button>(R.id.bt_submit)
//
//        val txtShow = textView
//        txtShow.setText("test: ${word}")

        bt_submit.setOnClickListener{
            Toast.makeText(this, "OnClick",Toast.LENGTH_LONG).show()

            AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("Hello World")
                .setPositiveButton("ok", null)
                .show()
        }
    }



}
