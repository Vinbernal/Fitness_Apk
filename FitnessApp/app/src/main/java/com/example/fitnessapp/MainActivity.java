package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.yoga.aboutus;

public class MainActivity extends AppCompatActivity {

    ImageButton imgaboutus;
    ImageButton imgfood;
    ImageButton imgmusic;
    ImageButton imgworkout;
    ImageButton imgplanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//reminder button
        Button next = findViewById(R.id.btnreminder);
        next.setOnClickListener(view -> {
            Intent intent = new Intent(this, Reminder.class);
            startActivity(intent);
        });
//title and color of bar
        getSupportActionBar().setTitle("Workout Rhythm ");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));


//Code for opening another activity
        imgfood = (ImageButton) findViewById(R.id.btnfood);
        imgfood.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View view) {
                Intent loadnewact = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(loadnewact);
            }
        });

        imgmusic = (ImageButton) findViewById(R.id.btnmusic);
        imgmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actnew = new Intent(MainActivity.this, Music.class);
                startActivity(actnew);
            }
        });


        imgworkout = (ImageButton) findViewById(R.id.btnworkout);
        imgworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnewact = new Intent(MainActivity.this, Workout.class);
                startActivity(intnewact);
            }
        });

        imgplanner = (ImageButton) findViewById(R.id.btnplanner);
        imgplanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newact = new Intent(MainActivity.this, Planner.class);
                startActivity(newact);
            }
        });
        imgaboutus = (ImageButton) findViewById(R.id.imageButton);
        imgaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newts1 = new Intent(MainActivity.this, aboutus.class);
                startActivity(newts1);
            }
        });

    }
}