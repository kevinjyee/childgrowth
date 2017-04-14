package com.childgrowth.childgrowth;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.LayoutInflater;

import mehdi.sakout.fancybuttons.FancyButton;


public class MainActivity extends Activity implements View.OnClickListener {
    private Button profileButton;
    private Button infoButton;
    private Button historybutton;
    private Button settingsbutton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        profileButton = (Button) findViewById(R.id.button1);
        profileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent profileIntent = new Intent(MainActivity.this,ProfileActivity.class);
                MainActivity.this.startActivity(profileIntent);
            }
        });

        infoButton = (Button) findViewById(R.id.button2);
       infoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        historybutton = (Button) findViewById(R.id.button3);
        historybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        settingsbutton = (Button) findViewById(R.id.button4);
        settingsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void onClick(View v) {

        }

        }


