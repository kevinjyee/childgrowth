package com.childgrowth.childgrowth;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.LayoutInflater;

public class MainActivity extends Fragment implements View.OnClickListener {
    private Button profilebutton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, null);
        //Profile Button
        profilebutton = (Button) view.findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(this);
        //Include More buttons below as we see fit

        //Include


        //Include
        return view;

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.profilebutton) {
            profilebutton.setEnabled(false);

        }
        }

        }


