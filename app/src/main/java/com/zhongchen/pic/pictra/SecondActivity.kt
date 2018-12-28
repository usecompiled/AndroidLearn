package com.zhongchen.pic.pictra

import android.content.Intent
import android.net.Uri

import android.os.Bundle
import android.util.Log
import android.widget.Button

import com.zhongchen.pic.utils.ActivityCollector
import com.zhongchen.pic.utils.BaseActivity

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("SecondActivity", "Task id is $taskId")
        setContentView(R.layout.activity_second)
        val button1 = findViewById<Button>(R.id.buttons1)
        button1.setOnClickListener {
            val intent2 = Intent(Intent.ACTION_VIEW)
            intent2.data = Uri.parse("https://www.billboard.com/charts/country-songs")
            startActivity(intent2)
        }

        val button2 = findViewById<Button>(R.id.buttons2)
        button2.setOnClickListener { ActivityCollector.finshAll() }

        val button3 = findViewById<Button>(R.id.buttons3)
        button3.setOnClickListener {
            val intent = Intent(this@SecondActivity, ListActivity::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.buttons4)
        button4.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:15038712191")
            startActivity(intent)
        }
    }
}
