package com.childgrowth.childgrowth;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Kevin on 4/12/2017.
 */


public class ProfileActivity extends Activity implements View.OnClickListener {
    private Button profilebutton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


    @Override
    public void onClick(View v) {

    }

}
