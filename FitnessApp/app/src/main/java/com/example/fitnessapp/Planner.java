package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Planner extends AppCompatActivity {

    ImageButton imghome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        imghome = (ImageButton) findViewById(R.id.btnhamburger2);
        imghome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intloadnewact = new Intent(Planner.this, MainActivity.class);
                startActivity(intloadnewact);
            }
        });

    }
}