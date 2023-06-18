package com.example.infinite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class INFINITE21 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinite21);
        Button backButton2 = (Button) findViewById(R.id.button14);
        Button playButton221 = (Button) findViewById(R.id.button9);
        Button playButton222 = (Button) findViewById(R.id.button13);
        Button playButton223 = (Button) findViewById(R.id.button8);
        Button playButton224 = (Button) findViewById(R.id.button12);
        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE1();
            }
        });
        playButton221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE3();
            }
        });
        playButton222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE3();
            }
        });
        playButton223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE3();
            }
        });
        playButton224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE3();
            }
        });
    }

    public void INFINITE3() {
        Intent intent = new Intent(this,INFINITE3.class);
        startActivity(intent);
    }
    public void INFINITE1() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    }

