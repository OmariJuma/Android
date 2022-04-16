package com.example.kodecamp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button= findViewById(R.id.button)
        val test= findViewById<TextView>(R.id.textView3)
        var behavior=arrayOf("lazy", "very lazy", "somewhat lazy","hardworking","dedicated")


        btn.setOnClickListener(){
            var random=behavior.random()
            test.text= "$random"
        }
    }
}


