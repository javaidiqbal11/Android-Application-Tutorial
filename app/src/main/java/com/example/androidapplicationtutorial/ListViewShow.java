package com.example.androidapplicationtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewShow extends AppCompatActivity {
    ListView listView;
    String weekdays[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_show);

        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.activity_list_view, R.id.textview, weekdays);
        listView.setAdapter(arrayAdapter);

    }
}