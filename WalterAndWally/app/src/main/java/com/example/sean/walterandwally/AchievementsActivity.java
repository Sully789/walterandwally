/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is where the user can view the Acheivements
*/

package com.example.sean.walterandwally;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AchievementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        Context context = this;
        String msg = "Select an achievement and try to unlock it!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();

        Button ach1Clicked = (Button) findViewById(R.id.ach1);
        Button ach2Clicked = (Button) findViewById(R.id.ach2);
        Button ach3Clicked = (Button) findViewById(R.id.ach3);
        Button ach4Clicked = (Button) findViewById(R.id.ach4);
        Button ach5Clicked = (Button) findViewById(R.id.ach5);
        Button ach6Clicked = (Button) findViewById(R.id.ach6);

        ach1Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create Dialog
                final Dialog dialog = new Dialog(AchievementsActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("Achievement 1");
                dialog.setCancelable(true);

                //Create text for achievement information
                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.ach1_description);

                //Create image for achievement
                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.ach1);

                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.char_back_to_lore);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                //Display dialog
                dialog.show();
            }
        });

        ach2Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AchievementsActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.ach2_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.ach2);

                Button button = (Button) dialog.findViewById(R.id.char_back_to_lore);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        ach3Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AchievementsActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.ach3_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.ach3);

                Button button = (Button) dialog.findViewById(R.id.char_back_to_lore);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        ach4Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AchievementsActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.ach4_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.ach4);

                Button button = (Button) dialog.findViewById(R.id.char_back_to_lore);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        ach5Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AchievementsActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.ach5_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.ach5);

                Button button = (Button) dialog.findViewById(R.id.char_back_to_lore);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        ach6Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AchievementsActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.ach6_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.ach6);

                Button button = (Button) dialog.findViewById(R.id.char_back_to_lore);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
}
