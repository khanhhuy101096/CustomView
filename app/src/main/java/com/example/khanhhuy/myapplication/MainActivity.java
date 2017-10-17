package com.example.khanhhuy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SimpleView simpleViewCircle;
    private SimpleView simpleViewSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView simpleText = (TextView) findViewById(R.id.text_simple);
        simpleText.setText("That is a simple TextView");

        simpleViewCircle = (SimpleView) findViewById(R.id.simpleViewCircle);
        simpleViewSquare = (SimpleView) findViewById(R.id.simpleViewSquare);
    }

}
