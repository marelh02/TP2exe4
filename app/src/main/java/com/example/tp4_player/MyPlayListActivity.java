package com.example.tp4_player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyPlayListActivity extends AppCompatActivity {

    private Button btnstoplist;
    private ListView musiclist;
    private String[] list = {"symphony_war"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_play_list);

        btnstoplist = findViewById(R.id.btnstoplist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MyPlayListActivity.this, R.layout.activity_my_play_list,list);

        musiclist = (ListView) findViewById(R.id.musiclist);
        musiclist.setAdapter(adapter);
        musiclist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                String p = parent.getItemAtPosition(pos).toString(); //element cliqué
            }
        });



    }
}