package com.github.jules552.bootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainButton = findViewById<View>(R.id.mainButton) as Button
        val inputText = findViewById<View>(R.id.inputText) as TextView

        mainButton.setOnClickListener {
            val intent = Intent(this, GreetingActivity::class.java)
            intent.putExtra("name", inputText.text.toString())
            startActivity(intent)
        }
    }
}



