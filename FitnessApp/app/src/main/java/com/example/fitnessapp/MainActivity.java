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

        imgfood = (ImageButton) findViewById(R.id.btnfood);
        imgfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intloadnewact = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intloadnewact);
            }
        });

        imgmusic = (ImageButton) findViewById(R.id.btnmusic);
        imgmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intloadnewact = new Intent(MainActivity.this, Music.class);
                startActivity(intloadnewact);
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



    }
}