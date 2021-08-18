package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.fitnessapp.dayfood.Day1;
import com.example.fitnessapp.dayfood.Day10;
import com.example.fitnessapp.dayfood.Day11;
import com.example.fitnessapp.dayfood.Day12;
import com.example.fitnessapp.dayfood.Day13;
import com.example.fitnessapp.dayfood.Day14;
import com.example.fitnessapp.dayfood.Day15;
import com.example.fitnessapp.dayfood.Day16;
import com.example.fitnessapp.dayfood.Day17;
import com.example.fitnessapp.dayfood.Day18;
import com.example.fitnessapp.dayfood.Day19;
import com.example.fitnessapp.dayfood.Day2;
import com.example.fitnessapp.dayfood.Day20;
import com.example.fitnessapp.dayfood.Day21;
import com.example.fitnessapp.dayfood.Day22;
import com.example.fitnessapp.dayfood.Day23;
import com.example.fitnessapp.dayfood.Day24;
import com.example.fitnessapp.dayfood.Day25;
import com.example.fitnessapp.dayfood.Day26;
import com.example.fitnessapp.dayfood.Day27;
import com.example.fitnessapp.dayfood.Day28;
import com.example.fitnessapp.dayfood.Day29;
import com.example.fitnessapp.dayfood.Day3;
import com.example.fitnessapp.dayfood.Day30;
import com.example.fitnessapp.dayfood.Day4;
import com.example.fitnessapp.dayfood.Day5;
import com.example.fitnessapp.dayfood.Day6;
import com.example.fitnessapp.dayfood.Day7;
import com.example.fitnessapp.dayfood.Day8;
import com.example.fitnessapp.dayfood.Day9;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15,
             card16, card17, card18, card19, card20, card21, card22, card23, card24, card25, card26, card27, card28, card29, card30;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);
        card6 = (CardView) findViewById(R.id.c6);
        card7 = (CardView) findViewById(R.id.c7);
        card8 = (CardView) findViewById(R.id.c8);
        card9 = (CardView) findViewById(R.id.c9);
        card10 = (CardView) findViewById(R.id.c10);
        card11 = (CardView) findViewById(R.id.c11);
        card12 = (CardView) findViewById(R.id.c12);
        card13 = (CardView) findViewById(R.id.c13);
        card14 = (CardView) findViewById(R.id.c14);
        card15 = (CardView) findViewById(R.id.c15);
        card16 = (CardView) findViewById(R.id.c16);
        card17 = (CardView) findViewById(R.id.c17);
        card18 = (CardView) findViewById(R.id.c18);
        card19 = (CardView) findViewById(R.id.c19);
        card20 = (CardView) findViewById(R.id.c20);
        card21 = (CardView) findViewById(R.id.c21);
        card22 = (CardView) findViewById(R.id.c22);
        card23 = (CardView) findViewById(R.id.c23);
        card24 = (CardView) findViewById(R.id.c24);
        card25 = (CardView) findViewById(R.id.c25);
        card26 = (CardView) findViewById(R.id.c26);
        card27 = (CardView) findViewById(R.id.c27);
        card28 = (CardView) findViewById(R.id.c28);
        card29 = (CardView) findViewById(R.id.c29);
        card30 = (CardView) findViewById(R.id.c30);



        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);
        card11.setOnClickListener(this);
        card12.setOnClickListener(this);
        card13.setOnClickListener(this);
        card14.setOnClickListener(this);
        card15.setOnClickListener(this);
        card16.setOnClickListener(this);
        card17.setOnClickListener(this);
        card18.setOnClickListener(this);
        card19.setOnClickListener(this);
        card20.setOnClickListener(this);
        card21.setOnClickListener(this);
        card22.setOnClickListener(this);
        card23.setOnClickListener(this);
        card24.setOnClickListener(this);
        card25.setOnClickListener(this);
        card26.setOnClickListener(this);
        card27.setOnClickListener(this);
        card28.setOnClickListener(this);
        card29.setOnClickListener(this);
        card30.setOnClickListener(this);




        //action bar title AND color
        getSupportActionBar().setTitle("30 Days Meal Planner");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));
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
            case R.id.c6:
                i = new Intent( this, Day6.class);
                startActivity(i);
                break;
            case R.id.c7:
                i = new Intent( this, Day7.class);
                startActivity(i);
                break;
            case R.id.c8:
                i = new Intent( this, Day8.class);
                startActivity(i);
                break;
            case R.id.c9:
                i = new Intent( this, Day9.class);
                startActivity(i);
                break;
            case R.id.c10:
                i = new Intent( this, Day10.class);
                startActivity(i);
                break;
            case R.id.c11:
                i = new Intent( this, Day11.class);
                startActivity(i);
                break;
            case R.id.c12:
                i = new Intent( this, Day12.class);
                startActivity(i);
                break;
            case R.id.c13:
                i = new Intent( this, Day13.class);
                startActivity(i);
                break;
            case R.id.c14:
                i = new Intent( this, Day14.class);
                startActivity(i);
                break;
            case R.id.c15:
                i = new Intent( this, Day15.class);
                startActivity(i);
                break;
            case R.id.c16:
                i = new Intent( this, Day16.class);
                startActivity(i);
                break;
            case R.id.c17:
                i = new Intent( this, Day17.class);
                startActivity(i);
                break;
            case R.id.c18:
                i = new Intent( this, Day18.class);
                startActivity(i);
                break;
            case R.id.c19:
                i = new Intent( this, Day19.class);
                startActivity(i);
                break;
            case R.id.c20:
                i = new Intent( this, Day20.class);
                startActivity(i);
                break;
            case R.id.c21:
                i = new Intent( this, Day21.class);
                startActivity(i);
                break;
            case R.id.c22:
                i = new Intent( this, Day22.class);
                startActivity(i);
                break;
            case R.id.c23:
                i = new Intent( this, Day23.class);
                startActivity(i);
                break;
            case R.id.c24:
                i = new Intent( this, Day24.class);
                startActivity(i);
                break;
            case R.id.c25:
                i = new Intent( this, Day25.class);
                startActivity(i);
                break;
            case R.id.c26:
                i = new Intent( this, Day26.class);
                startActivity(i);
                break;
            case R.id.c27:
                i = new Intent( this, Day27.class);
                startActivity(i);
                break;
            case R.id.c28:
                i = new Intent( this, Day28.class);
                startActivity(i);
                break;
            case R.id.c29:
                i = new Intent( this, Day29.class);
                startActivity(i);
                break;
            case R.id.c30:
                i = new Intent( this, Day30.class);
                startActivity(i);
                break;









        }


    }
}