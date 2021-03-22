package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.fitnessapp.dayfood.Day1;
import com.example.fitnessapp.dayfood.Day2;
import com.example.fitnessapp.dayfood.Day3;
import com.example.fitnessapp.dayfood.Day4;
import com.example.fitnessapp.dayfood.Day5;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);



        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);





        //action bar title AND color
        getSupportActionBar().setTitle("30 Days Meal Planner");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.c1:
                i = new Intent( this, Day1.class);
                startActivity(i);
                break;
            case R.id.c2:
                i = new Intent( this, Day2.class);
                startActivity(i);
                break;
            case R.id.c3:
                i = new Intent( this, Day3.class);
                startActivity(i);
                break;
            case R.id.c4:
                i = new Intent( this, Day4.class);
                startActivity(i);
                break;
            case R.id.c5:
            i = new Intent( this, Day5.class);
            startActivity(i);
            break;









        }


    }
}