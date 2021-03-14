package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class NoEquipment extends AppCompatActivity {
    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_equipment);

        getSupportActionBar().setTitle("No Equipment Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //btn to lunges
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, noequip1.class);
            startActivity(intent);
        });

        Button buttonpush = findViewById(R.id.button3);
        buttonpush.setOnClickListener(view -> {
            Intent intent = new Intent(this, pushups.class);
            startActivity(intent);
        });

    }
}