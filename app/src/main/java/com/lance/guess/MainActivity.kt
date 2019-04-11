package com.lance.guess

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val word = "MainActivity OnCreact"

    private val REQUEST_RESULT: Int = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = findViewById<TextView>(R.id.txtShow)
//        val bt_submit = findViewById<Button>(R.id.bt_submit)
//
//        val txtShow = textView
//        txtShow.setText("test: ${word}")

        bt_submit.setOnClickListener {
            val inputNumber = ed_number.text.toString()
            Toast.makeText(this, inputNumber, Toast.LENGTH_LONG).show()

            replay(inputNumber)
        }
    }

    private fun replay(inputNumber: String) {
        AlertDialog.Builder(this)
            .setTitle("Input Number")
            .setMessage(inputNumber)
            .setPositiveButton("ok") { _, _ ->
                var intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("result", inputNumber)
                startActivityForResult(intent, REQUEST_RESULT)
            }
            .setNeutralButton("cancel") { dialog, which ->  

            }
            .show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == REQUEST_RESULT && resultCode == Activity.RESULT_OK) {
            replay("${data?.getStringExtra("RESULT_TEXT")}")
        }
    }
}
