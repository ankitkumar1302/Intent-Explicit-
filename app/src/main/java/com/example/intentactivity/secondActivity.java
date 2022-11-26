package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView learn,ankit;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        learn = findViewById(R.id.learn);
        ankit = findViewById(R.id.ankit);

        Intent i = getIntent();
        data = i.getStringExtra("dataname");

        learn.setText("hey whathapp! My Name is: "+ data);
        ankit.setText("ankit "+data);

    }
}