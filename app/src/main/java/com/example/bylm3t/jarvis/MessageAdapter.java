package com.example.bylm3t.jarvis;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by BYLM3T on 2016.10.13..
 */

public class MessageAdapter extends ArrayAdapter<String>
{
    public MessageAdapter(Context context, String[] objects){
        super(context, R.layout.message, objects);
    }
}
