package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.noequipworkout.Supermanplanks;
import com.example.fitnessapp.noequipworkout.burpees;
import com.example.fitnessapp.noequipworkout.crosscrunches;
import com.example.fitnessapp.noequipworkout.divepushups;
import com.example.fitnessapp.noequipworkout.highknees;
import com.example.fitnessapp.noequipworkout.jumpingjack;
import com.example.fitnessapp.noequipworkout.mountainclimber;
import com.example.fitnessapp.noequipworkout.shouldertaps;
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
        //to superman planks
        Button butplanks = findViewById(R.id.button5);
        butplanks.setOnClickListener(view -> {
            Intent intent = new Intent(this, Supermanplanks.class);
            startActivity(intent);
        });
        //to superman burpees
        Button burp = findViewById(R.id.button6);
        burp.setOnClickListener(view -> {
            Intent intent = new Intent(this, burpees.class);
            startActivity(intent);
        });
        //to superman jumpingjack
        Button jump = findViewById(R.id.button7);
        jump.setOnClickListener(view -> {
            Intent intent = new Intent(this, jumpingjack.class);
            startActivity(intent);
        });
        //to superman highknees
        Button hknees = findViewById(R.id.button8);
        hknees.setOnClickListener(view -> {
            Intent intent = new Intent(this, highknees.class);
            startActivity(intent);
        });
        //to superman dive push
        Button dive = findViewById(R.id.button9);
        dive.setOnClickListener(view -> {
            Intent intent = new Intent(this, divepushups.class);
            startActivity(intent);
        });
        //to superman mountain climb
        Button climb = findViewById(R.id.button10);
        climb.setOnClickListener(view -> {
            Intent intent = new Intent(this, mountainclimber.class);
            startActivity(intent);
        });
        //to superman taps
        Button taps = findViewById(R.id.button11);
        taps.setOnClickListener(view -> {
            Intent intent = new Intent(this, shouldertaps.class);
            startActivity(intent);
        });
        //to superman cross crunches
        Button cross = findViewById(R.id.button12);
        cross.setOnClickListener(view -> {
            Intent intent = new Intent(this, crosscrunches.class);
            startActivity(intent);
        });

    }
}