package com.example.fitnessapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pushups extends AppCompatActivity {

    TextView textpush1;
    Button push1;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushups);

        getSupportActionBar().setTitle("Pushup Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textpush1 = findViewById(R.id.txtviewpush1);
        push1 = findViewById(R.id.push1);
//two parameter
        countDownTimer = new CountDownTimer(26000, 1000) {
            @Override
            public void onTick(long milliUntilFinished) {
                textpush1.setText(milliUntilFinished/1000 + " sec left");
            }
            @Override
            public void onFinish() {
                textpush1.setText("SET FINISHED");
                Toast.makeText(pushups.this, "FINISH", Toast.LENGTH_SHORT).show();
            }
        };

        push1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(pushups.this, "TIME START", Toast.LENGTH_SHORT).show();
                countDownTimer.start();

            }
        });

    }
}