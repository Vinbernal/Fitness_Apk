package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.fitnessapp.Adapter.ToDoAdapter;
import com.example.fitnessapp.Mode.ToDoMode;
import com.example.fitnessapp.Utils.DataBasaHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Planner extends AppCompatActivity implements OnDialogCloseListener {
    private RecyclerView mRecyclerView;
    private FloatingActionButton fab;
    private DataBasaHelper myDB;
    private List<ToDoMode> mList;
    private ToDoAdapter adapter;

    ImageButton imghome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        //action bar title AND color
        getSupportActionBar().setTitle("Planner");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff7f50")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = findViewById(R.id.recyclerview);
        fab = findViewById(R.id.fab);
        myDB = new DataBasaHelper(Planner.this);
        mList = new ArrayList<>();
        adapter = new ToDoAdapter(myDB, Planner.this);

        mList = myDB.getAllTask();
        Collections.reverse(mList);
        adapter.setTasks(mList);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddNewTask.newInstance().show(getSupportFragmentManager(), AddNewTask.TAG);

            }
        });

        }





    @Override
    public void onDialogClose(DialogInterface dialogInterface) {
        mList = myDB.getAllTask();
        Collections.reverse(mList);
        adapter.setTasks(mList);
        adapter.notifyDataSetChanged();

    }
}