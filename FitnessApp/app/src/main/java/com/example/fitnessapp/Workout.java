package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        //action bar title AND color
        getSupportActionBar().setTitle("Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //button to new act

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, NoEquipment.class);
            startActivity(intent);
        });
    }
}