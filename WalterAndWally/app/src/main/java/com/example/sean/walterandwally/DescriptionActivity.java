/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is where the user can view more information about Characters in the game
*/

package com.example.sean.walterandwally;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        String[] items = {getResources().getString(R.string.description_item_name),
                getResources().getString(R.string.description_item_age),
                getResources().getString(R.string.description_item_strengths),
                getResources().getString(R.string.description_item_weaknesses),
                getResources().getString(R.string.description_item_description)};

        ListView menu_items = (ListView) findViewById(R.id.description_list);

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.description_item, items);

        //Assign adapter to ListView
        menu_items.setAdapter(adapt);

        menu_items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {

                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();

                if (strText.equalsIgnoreCase(getResources().getString(R.string.description_item_name)))
                {
                   // startActivity(new Intent(MenuActivity.this, PlayActivity.class));
                }

                else if (strText.equalsIgnoreCase(getResources().getString(R.string.description_item_age)))
                {
                   // startActivity(new Intent(MenuActivity.this, ScoreActivity.class));
                }

                else if (strText.equalsIgnoreCase(getResources().getString(R.string.description_item_strengths)))
                {
                   // startActivity(new Intent(MenuActivity.this, SettingsActivity.class));
                }

                else if (strText.equalsIgnoreCase(getResources().getString(R.string.description_item_weaknesses)))
                {
                   // startActivity(new Intent(MenuActivity.this, HelpActivity.class));
                }

                else if (strText.equalsIgnoreCase(getResources().getString(R.string.description_item_description)))
                {
                    // startActivity(new Intent(MenuActivity.this, HelpActivity.class));
                }
            }
        });
    }
}
