package com.example.projektapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {


    private ArrayList<Stadio> stadioArrayList = new ArrayList<>();
    private ArrayAdapter<Stadio> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button listview_button = findViewById(R.id.lisview_button);
        listview_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}