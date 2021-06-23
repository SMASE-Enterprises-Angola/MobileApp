package com.example.meuprograma;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"oncreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onstart");
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        Log.i(TAG,"onstart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onrestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"ondestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i(TAG,"onscreate");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onrestor");
    }
}