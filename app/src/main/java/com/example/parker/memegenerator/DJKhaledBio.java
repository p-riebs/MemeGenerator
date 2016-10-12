package com.example.parker.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DJKhaledBio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djkhaled_bio);

        getSupportActionBar().setTitle("Homogeneous Khalidius");

        WebView wv  = new WebView(DJKhaledBio.this);

        wv.loadUrl("https://web.archive.org/web/20160129032455/https://en.m.wikipedia.org/wiki/Homogeneous_Khalidius");
        setContentView(wv);
    }
}
