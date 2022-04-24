package com.example.lifecycleactivity24042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnNagativeScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","Main : onCreate");

        mBtnNagativeScreen2=findViewById(R.id.buttonNagativeScreen2);

        mBtnNagativeScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main : onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main : onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main : onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main : onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main : on reStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main : on deStroy");
    }
}