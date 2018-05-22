package com.nicodo.dontburnit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nicodo.dontburnit.R;

public class MainActivity extends AppCompatActivity {
    // Build three tabs
    // Tab 1 - Start timer - Main
    // Tab 2 - Favorite List
    // Tab 3 - Live view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
