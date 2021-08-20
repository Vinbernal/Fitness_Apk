package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.cardio.bodyhit;
import com.example.fitnessapp.cardio.lowimpact;

public class cardioworkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardioworkout);

        getSupportActionBar().setTitle("Cardio Workout!");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button buttonview = findViewById(R.id.button);
        buttonview.setOnClickListener(view -> {
            Intent intent = new Intent(this, videoview.class);
            startActivity(intent);
        });

        Button buttonview1 = findViewById(R.id.button3);
        buttonview1.setOnClickListener(view -> {
            Intent intent = new Intent(this, bodyhit.class);
            startActivity(intent);
        });

        Button buttonview2 = findViewById(R.id.button4);
        buttonview2.setOnClickListener(view -> {
            Intent intent = new Intent(this, lowimpact.class);
            startActivity(intent);
        });



    }
}