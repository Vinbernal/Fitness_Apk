package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Workout extends AppCompatActivity {
    ImageButton imghome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        //action bar title AND color
        getSupportActionBar().setTitle("Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}