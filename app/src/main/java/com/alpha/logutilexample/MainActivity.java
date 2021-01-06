package com.alpha.logutilexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alpha.logutil.RandIntGenerator;

public class MainActivity extends AppCompatActivity {

    public static int randint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x = RandIntGenerator.getRandInt();

        Log.d("MainActivity", "onCreate: "+ x);
    }
}