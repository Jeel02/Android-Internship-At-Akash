package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] browsers = {"Chrome",
                "Firefox",
                "Safari",
                "Internet Explorer",
                "Brave",
                "Kiwi",
                "Via",
                "Tor",
                "Opera",
                "Opera GX",
                "UC",
                "DuckDuckGo",
                "Microsoft Edge",
                "Opera Mini",
                "Puffin",
                "Dolphin",
                "Jio",
                "Firefox Nightly"
               };

        final ArrayList arrayList = new ArrayList(Arrays.asList(browsers));
        final ListView listView = (ListView)findViewById(R.id.userlist);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Browser Name : " + arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
