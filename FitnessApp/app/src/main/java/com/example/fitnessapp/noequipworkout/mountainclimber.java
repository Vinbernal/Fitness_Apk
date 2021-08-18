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

public class mountainclimber extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountainclimber);

        getSupportActionBar().setTitle("Mountain Climber Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //button next to mountainclimbers
        Button next = findViewById(R.id.btn2);
        next.setOnClickListener(view -> {
            Intent intent = new Intent(this, shouldertaps.class);
            startActivity(intent);
        });
        Button next1 = findViewById(R.id.btn3);
        next1.setOnClickListener(view -> {
            Intent intent = new Intent(this, divepushups.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        });

        chronometer = findViewById(R.id.chronometer);
        // chronometer.setFormat("Time: %s");
        chronometer.setBase(SystemClock.elapsedRealtime());

        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if ((SystemClock.elapsedRealtime() - chronometer.getBase()) >= 80000) {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(mountainclimber.this, "Great!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mountainclimber.this, squat.class);
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