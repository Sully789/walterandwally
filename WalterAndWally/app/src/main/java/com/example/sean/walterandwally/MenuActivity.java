/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is used to navigate to the various other screens on the app
*/
package com.example.sean.walterandwally;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Context context = this;
        String msg = "Use the Buttons to Navigate through the App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_in_button:
                Intent intent = new Intent(this, SignInActivity.class);
                startActivity(intent);
                break;
            case R.id.leaderboard_button:
                Intent intent1 = new Intent(this, LeaderboardActivity.class);
                startActivity(intent1);
                break;
            case R.id.lore_button:
                Intent intent2 = new Intent(this, LoreActivity.class);
                startActivity(intent2);
                break;
            case R.id.achievements_button:
                Intent intent3 = new Intent(this, AchievementsActivity.class);
                startActivity(intent3);
                break;
            case R.id.leaderboard_button2:
                Intent intent4 = new Intent(this, DatabaseActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
