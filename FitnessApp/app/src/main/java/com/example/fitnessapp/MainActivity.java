package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.fitnessapp.yoga.aboutus;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageButton imgaboutus;
    ImageButton imgfood;
    ImageButton imgmusic;
    ImageButton imgworkout;
    ImageButton imgplanner;

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<SlidingModel> imageModelArrayList;

    private int[] myImageList = new int[]{R.drawable.fitnesswoman, R.drawable.example1,
            R.drawable.example2, R.drawable.example3, R.drawable.example4 , R.drawable.example5  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//reminder button
        Button next = findViewById(R.id.btnreminder);
        next.setOnClickListener(view -> {
            Intent intent = new Intent(this, Reminder.class);
            startActivity(intent);
        });
//title and color of bar
        getSupportActionBar().setTitle("Workout Rhythm ");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4267B2")));


//Code for opening another activity
        imgfood = (ImageButton) findViewById(R.id.btnfood);
        imgfood.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent loadnewact = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(loadnewact);
            }
        });

        imgmusic = (ImageButton) findViewById(R.id.btnmusic);
        imgmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actnew = new Intent(MainActivity.this, Music.class);
                startActivity(actnew);
            }
        });


        imgworkout = (ImageButton) findViewById(R.id.btnworkout);
        imgworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnewact = new Intent(MainActivity.this, Workout.class);
                startActivity(intnewact);
            }
        });

        imgplanner = (ImageButton) findViewById(R.id.btnplanner);
        imgplanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newact = new Intent(MainActivity.this, Planner.class);
                startActivity(newact);
            }
        });

        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();
        init();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1){

            Intent intent = new Intent(MainActivity.this,aboutus.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //////////
    private ArrayList<SlidingModel> populateList() {
        ArrayList<SlidingModel> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SlidingModel imageModel = new SlidingModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }
        return list;
    }

    private void init() {
        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SlidingAdapter(MainActivity.this, imageModelArrayList));

        NUM_PAGES = imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, false);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);
    }


}