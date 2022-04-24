package com.example.lifecycleactivity24042022;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("BBB","Main3 : onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main3 : onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main3 : onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main3 : onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main3 : onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main3 : on reStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main3 : on deStroy");
    }
}