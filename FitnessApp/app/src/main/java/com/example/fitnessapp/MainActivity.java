package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    ImageButton imgfood;
    ImageButton imgmusic;
    ImageButton imgworkout;
    ImageButton imgplanner;
    ImageButton imghamburger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        imghamburger = (ImageButton) findViewById(R.id.btnhamburger);
        imghamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intloadnewact = new Intent(MainActivity.this, hamburger.class);
                startActivity(intloadnewact);
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
//


    }
}