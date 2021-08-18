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

public class noequip1 extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noequip1);

        getSupportActionBar().setTitle("Lunges Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //button next to pushups
        Button next = findViewById(R.id.btn2);
        next.setOnClickListener(view -> {
            Intent intent = new Intent(noequip1.this, pushups.class);
            startActivity(intent);
        });

        chronometer = findViewById(R.id.chronometer);
        // chronometer.setFormat("Time: %s");
        chronometer.setBase(SystemClock.elapsedRealtime());

        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if ((SystemClock.elapsedRealtime() - chronometer.getBase()) >= 25000) {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(noequip1.this, "Great!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(noequip1.this, pushups.class);
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