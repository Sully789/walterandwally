/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is the splash screen for the app
An animation displays the Logo, and then the Menu Acitivty is launched
*/

package com.example.sean.walterandwally;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image1 = (ImageView) findViewById(R.id.logo);
        TextView splash = (TextView) findViewById(R.id.splash);
        TextView version = (TextView) findViewById(R.id.version);

        Animation fadeSpin = AnimationUtils.loadAnimation(this, R.anim.fade_spin);
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade1);
        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade2);

        fadeSpin.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        image1.startAnimation(fadeSpin);
        splash.startAnimation(fade1);
        version.setAnimation(fade2);
    }

    public void onPause() {
        super.onPause();

        ImageView image1 = (ImageView) findViewById(R.id.logo);
        TextView splash = (TextView) findViewById(R.id.splash);
        TextView version = (TextView) findViewById(R.id.version);


        image1.clearAnimation();
        splash.clearAnimation();
        version.clearAnimation();
    }

}

