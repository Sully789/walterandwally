/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is where the user can view the Lore of the game
*/

package com.example.sean.walterandwally;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lore);

        Context context = this;
        String msg = "Select a character to learn more about them";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();

        Button char1Clicked = (Button) findViewById(R.id.char1);
        Button char2Clicked = (Button) findViewById(R.id.char2);
        Button char3Clicked = (Button) findViewById(R.id.char3);
        Button char4Clicked = (Button) findViewById(R.id.char4);
        Button char5Clicked = (Button) findViewById(R.id.char5);
        Button char6Clicked = (Button) findViewById(R.id.char6);
        Button char7Clicked = (Button) findViewById(R.id.char7);
        Button char8Clicked = (Button) findViewById(R.id.char8);
        Button char9Clicked = (Button) findViewById(R.id.char9);

        char1Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create Dialog
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("Character 1");
                dialog.setCancelable(true);

                //Create text for character information
                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char1_description);

                //Create image for character
                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char1);

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

        char2Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char2_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char2);

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

        char3Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char3_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char3);

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

        char4Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char4_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char4);

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

        char5Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char5_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char5);

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

        char6Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char6_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char6);

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

        char7Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char7_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char7);

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

        char8Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char8_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char8);

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

        char9Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoreActivity.this);
                dialog.setContentView(R.layout.lore_dialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);

                TextView text = (TextView) dialog.findViewById(R.id.char_textview);
                text.setText(R.string.char9_description);

                ImageView img = (ImageView) dialog.findViewById(R.id.char_image);
                img.setImageResource(R.drawable.char9);

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

