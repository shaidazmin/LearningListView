package com.example.nz.learninglistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        String [] values = new String[]{"One","Two", "Three","fore","One","Two", "Three","fore","One","Two", "Three","fore","One","Two", "Three","fore"};

        ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,values);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0 ){
                    Intent intent = new Intent(MainActivity.this,OneActivity.class);
                    startActivity(intent);
                }
            }
        });




    }


}
