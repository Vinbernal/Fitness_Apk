package com.example.fitnessapp.noequipworkout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

public class jumpingjack extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumprope);

        getSupportActionBar().setTitle("Jumping jack Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //button next to high knees
        Button next = findViewById(R.id.btn2);
        next.setOnClickListener(view -> {
            Intent intent = new Intent(this, highknees.class);
            startActivity(intent);
        });
        Button next1 = findViewById(R.id.btn3);
        next1.setOnClickListener(view -> {
            Intent intent = new Intent(this, burpees.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        });

        chronometer = findViewById(R.id.chronometer);
        // chronometer.setFormat("Time: %s");
        chronometer.setBase(SystemClock.elapsedRealtime());

        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if ((SystemClock.elapsedRealtime() - chronometer.getBase()) >= 240000) {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(jumpingjack.this, "Great!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(jumpingjack.this, squat.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    public void startChronometer(View v) {
        if (!running) {
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            chronometer.start();
            running = true;
        }
    }

    public void pauseChronometer(View v) {
        if (running) {
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }
    }
    public void resetChronometer (View v){
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }
}