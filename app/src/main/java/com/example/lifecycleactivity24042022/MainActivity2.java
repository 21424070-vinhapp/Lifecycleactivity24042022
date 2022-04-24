package com.example.lifecycleactivity24042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button mBtnNagativeScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB","Main : onCreate");

        mBtnNagativeScreen3=findViewById(R.id.buttonNagativeScreen3);

        mBtnNagativeScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main2 : onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main2 : onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main2 : onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main2 : onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main2 : on reStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main2 : on deStroy");
    }
}