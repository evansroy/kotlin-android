package com.example.kotlingeneratenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGenerate.setOnClickListener{
            val rand = Random();
            textView.text = rand.nextInt(seekBar.progress).toString();
        }
    }
}
