package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.yoga.yogapick;

public class Workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        //action bar title AND color
        getSupportActionBar().setTitle("Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //button to new act

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, NoEquipment.class);
            startActivity(intent);
        });
        Button buttonview = findViewById(R.id.button2);
        buttonview.setOnClickListener(view -> {
            Intent intent = new Intent(this, cardioworkout.class);
            startActivity(intent);
        });

        Button yogaworkout = findViewById(R.id.button3);
        yogaworkout.setOnClickListener(view -> {
            Intent intent = new Intent(this, yogapick.class);
            startActivity(intent);
        });

    }
}