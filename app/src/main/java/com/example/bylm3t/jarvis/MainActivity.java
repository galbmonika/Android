package com.example.bylm3t.jarvis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private EditText text;
    private MessageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (EditText) findViewById(R.id.editText);
        list= (ListView) findViewById(R.id.list);
        adapter=new MessageAdapter(this, new ArrayList<String>());
        adapter.add(getString(R.string.hello));
        list.setAdapter(adapter);


    }
}
