/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is where the user can sign into the app
*/

package com.example.sean.walterandwally;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Context context = this;
        String msg = "Sign into your account";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.submit:
                //Add details to user database
                break;
            case R.id.register:
                Intent intent1 = new Intent(this, RegisterActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
