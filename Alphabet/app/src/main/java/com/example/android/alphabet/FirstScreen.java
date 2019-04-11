package com.example.android.alphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void learnButton(View v)
    {
        Intent learnIntent=new Intent(this,Learn.class);
        startActivity(learnIntent);
    }

    public void playButton(View v)
    {
        Log.e("Hi","BI");
    }
}
