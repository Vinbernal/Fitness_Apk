package com.example.fitnessapp.yoga;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

public class yogapick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogapick);

        getSupportActionBar().setTitle("Yoga Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button buttonview = findViewById(R.id.button1);
        buttonview.setOnClickListener(view -> {
            Intent intent = new Intent(this, yogawomen.class);
            startActivity(intent);
        });
        Button yogamen1 = findViewById(R.id.button2);
        yogamen1.setOnClickListener(view -> {
            Intent intent = new Intent(this, yogamen.class);
            startActivity(intent);
        });


    }
}