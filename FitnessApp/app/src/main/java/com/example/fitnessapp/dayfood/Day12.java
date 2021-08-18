package com.example.fitnessapp.dayfood;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

public class Day12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day12);

        getSupportActionBar().setTitle("Day 12 ");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}