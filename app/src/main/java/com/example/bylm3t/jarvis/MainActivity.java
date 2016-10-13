package com.example.bylm3t.jarvis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private EditText text;
    private MessageAdapter adapter;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (EditText) findViewById(R.id.editText);
        list= (ListView) findViewById(R.id.list);

        send=(Button) findViewById(R.id.send);
        adapter=new MessageAdapter(this, new ArrayList<String>());
        adapter.add(getString(R.string.hello));
        list.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText().toString();
                adapter.add(text.getText().toString());
                text.setText("");
                respond(str);
            }
        });

    }

    private void respond(String str) {
        adapter.add(str);
    }
}
