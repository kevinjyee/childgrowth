package com.childgrowth.childgrowth;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.childgrowth.childgrowth.utilities.CustomListAdapter;

/**
 * Created by Kevin on 4/16/2017.
 */

public class InfoActivity extends Activity {

    ListView list;
    String[] itemname ={
            "Article 1",
            "Article 2",
            "Article 3",
            "Article 4",
            "Article 5",
            "Article 6"
    };

    Integer[] imgid={
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.info_android_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}