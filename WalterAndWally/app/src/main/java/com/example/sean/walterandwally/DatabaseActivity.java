/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is where the user can view the Leaderboard
This activity was the planned implementaion, where the leaderboard would link to the web app and display the data
*/

package com.example.sean.walterandwally;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        WebView webView;
        setContentView(R.layout.activity_database);
        webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://webapp-190129231301.azurewebsites.net/Leaderboard");
    }

    public class WebViewController extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

