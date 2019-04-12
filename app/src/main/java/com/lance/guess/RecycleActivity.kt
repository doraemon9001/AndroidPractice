package com.lance.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycle.*
import kotlinx.android.synthetic.main.row_function.view.*

class RecycleActivity : AppCompatActivity() {

    val listData = listOf<String>(
        "A",
        "B",
        "C",
        "D",
        "E",
        "F",
        "G",
        "H",
        "I",
        "J",
        "K",
        "L",
        "M",
        "N",
        "O",
        "P",
        "Q"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        recycle.layoutManager = LinearLayoutManager(this)
        recycle.setHasFixedSize(true)
        recycle.adapter = FunctionAdapter()

        bt_back.setOnClickListener {
            finish()
        }
    }

    inner class FunctionAdapter:RecyclerView.Adapter<FunctionViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunctionViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_function, parent, false)

            var holder = FunctionViewHolder(view)
            return holder
        }

        override fun getItemCount(): Int {
            return listData.size
        }

        override fun onBindViewHolder(holder: FunctionViewHolder, position: Int) {
            holder.nameText.text = listData.get(position)
        }

    }

    inner class FunctionViewHolder(view:View):RecyclerView.ViewHolder(view){
        val nameText:TextView = view.tv_name
    }
}
