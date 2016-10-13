package com.example.bylm3t.jarvis;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BYLM3T on 2016.10.13..
 */

public class MessageAdapter extends ArrayAdapter<String>
{
    public MessageAdapter(Context context, List<String> objects){
        super(context, R.layout.message, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String msg=getItem(position);
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.message,parent,false);
        TextView t=(TextView) convertView.findViewById(R.id.text);
        t.setText(msg);
        return convertView;
    }
}
