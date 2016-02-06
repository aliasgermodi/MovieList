package com.example.ali.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    //Array of strings...
    String[] mobileArray = {"Android", "Iphone", "WindowsMobile", "Blackberry"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_main2, mobileArray);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }




}
