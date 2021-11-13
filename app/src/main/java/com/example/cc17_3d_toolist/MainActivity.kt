package com.example.cc17_3d_toolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_add = findViewById<TextView>(R.id.btn_add)

        btn_add.setOnClickListener {
            intent = Intent(this,AddActivity::class.java)
            startActivity(intent)

        }

    }
}