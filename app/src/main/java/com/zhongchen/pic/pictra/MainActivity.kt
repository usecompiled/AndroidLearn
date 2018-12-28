package com.zhongchen.pic.pictra

import android.content.Intent

import android.os.Bundle
import android.util.Log

import android.widget.Button

import com.zhongchen.pic.utils.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "Task id is $taskId")
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.buttonm)
        button.setOnClickListener {
            val intent = Intent("com.zhongchen.pic.pictra.ACTION_START")
            startActivity(intent)
        }

    }
}
