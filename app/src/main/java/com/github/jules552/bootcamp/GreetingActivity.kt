package com.github.jules552.bootcamp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val greetingText = findViewById<TextView>(R.id.greetingText)
        greetingText.text = getString(R.string.greeting_message, intent.getStringExtra("name"))
        greetingText.textSize = 20.0f
    }
}