package com.zhongchen.pic.pictra;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.zhongchen.pic.utils.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","Task id is "+ getTaskId());
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.zhongchen.pic.pictra.ACTION_START");
                startActivity(intent);
            }
        });

    }
}
