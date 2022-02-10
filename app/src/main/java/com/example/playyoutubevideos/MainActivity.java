package com.example.playyoutubevideos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = findViewById(R.id.button1);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.button1) {
            //define a new Intent for the second Activity
            Intent intent = new Intent(this, SecondActivity.class);

            //start the second Activity
            this.startActivity(intent);
        }
    }
}