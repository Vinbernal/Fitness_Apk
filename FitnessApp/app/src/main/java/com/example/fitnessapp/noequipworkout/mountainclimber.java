package com.example.fitnessapp.noequipworkout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

public class mountainclimber extends AppCompatActivity {

    TextView t1;
    Button b1;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountainclimber);

        getSupportActionBar().setTitle("Mountain Climber Workout");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        t1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.btn1);

        //two parameter
        countDownTimer = new CountDownTimer(61000, 1000) {
            @Override
            public void onTick(long milliUntilFinished) {
                t1.setText(milliUntilFinished/1000 + " sec left");
            }
            @Override
            public void onFinish() {
                t1.setText("SET FINISHED");
                Toast.makeText(mountainclimber.this, "FINISH", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mountainclimber.this, shouldertaps.class);
                startActivity(intent);
                finish();

            }
        };

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mountainclimber.this, "TIME START", Toast.LENGTH_SHORT).show();
                countDownTimer.start();

            }
        });
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
        });

    }
}