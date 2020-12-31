package com.app.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.textview);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setTextSize(1);
                tv.setText("Hello from Natasha");
                tv.setTextSize(50);
                btn.setBackgroundColor(Color.parseColor("#FF00AA"));
                tv.setTextColor(Color.parseColor("#FFFAB0"));
            }
        });
    }
}