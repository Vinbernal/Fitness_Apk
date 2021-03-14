package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.noequipworkout.squat;

public class NoEquipment extends AppCompatActivity {

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
        //to pushups
        Button buttonpush = findViewById(R.id.button3);
        buttonpush.setOnClickListener(view -> {
            Intent intent = new Intent(this, pushups.class);
            startActivity(intent);
        });
        //to squat
        Button buttonsquat = findViewById(R.id.button4);
        buttonsquat.setOnClickListener(view -> {
            Intent intent = new Intent(this, squat.class);
            startActivity(intent);
        });

    }
}