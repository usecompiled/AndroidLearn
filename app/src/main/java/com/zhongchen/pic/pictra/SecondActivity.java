package com.zhongchen.pic.pictra;

import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.zhongchen.pic.utils.ActivityCollector;
import com.zhongchen.pic.utils.BaseActivity;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("SecondActivity","Task id is "+ getTaskId());
        setContentView(R.layout.activity_second);
        Button button1 = findViewById(R.id.buttons1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.billboard.com/charts/country-songs"));
                startActivity(intent2);
            }
        });

        Button button2 = findViewById(R.id.buttons2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCollector.finshAll();
            }
        });

        Button button3 = findViewById(R.id.buttons3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
