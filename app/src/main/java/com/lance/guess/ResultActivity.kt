package com.lance.guess

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultText = intent.getStringExtra("result")

        tv_result.text = resultText

        //. SharedPreferences賦值
        getSharedPreferences("GUESS", Context.MODE_PRIVATE)
            .edit()
            .putString("REC_RESULT", resultText)
            .apply()
        //. SharedPreferences取值
        Log.d("REC_RESULT", getSharedPreferences("GUESS", Context.MODE_PRIVATE)
            .getString("REC_RESULT", ""))

    }
}
