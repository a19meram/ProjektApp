package com.example.projektapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import static com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_INDEFINITE;

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

        stadioArrayList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.item_list_textview, R.id.item_list_textview, stadioArrayList);
        ListView my_listview = (ListView) findViewById(R.id.my_listview);
        my_listview.setAdapter(adapter);
        Snackbar make = Snackbar.make(my_listview, "Hela vägen ", LENGTH_INDEFINITE);
        make.setAction("Open Toast", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                my_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(SecondActivity.this, "meddelande", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        make.show();
    }
}