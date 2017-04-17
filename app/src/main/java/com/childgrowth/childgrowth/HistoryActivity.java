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

public class HistoryActivity extends Activity {

    ListView list;
    String[] itemname ={
            "Responds to Sounds",
            "Regards Face",
            "Vocalizes",
            "Smiles Respponsively",
            "Head up 45 Degrees",
            "Ooo/Aaa",
            "Head Up 90 Degrees",
            "Hands Together",
            "Regards Own Hand",
            "Squeals",
            "Bears Weight on Legs",
            "Follows 180 Degrees",
            "Chest Up-Arm Support",
            "Regards Small Objects",
            "Rolls Over",
            "Turns to Sound",
            "Reaches",
            "Works for Toy",
            "Feeds Self",
            "Turns To Voice",
            "Sits, No Support",
            "Looks for Yarn",
            "Rakes Raisin",
            "Single Syllables"
    };

    Integer[] imgid={
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114,
            R.drawable.favico114x114


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.history_android_list);
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