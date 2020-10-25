package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.country);
        Intent intent = getIntent();
       String country= intent.getStringExtra("country");

        if (country.equals("selected "))
            text.setText("No country was selected");
        else
        {
            text.setText(country);

        }

    }
}