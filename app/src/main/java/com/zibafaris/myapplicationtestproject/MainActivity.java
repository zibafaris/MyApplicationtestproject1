package com.zibafaris.myapplicationtestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTag","onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyTag","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyTag","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyTag","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyTag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyTag","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MyTag","onRestart");
    }
}