package com.example.infinite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class INFINITE2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinite2);
        Button backButton2 = (Button) findViewById(R.id.button7);
        Button playButton21 = (Button) findViewById(R.id.button2);
        Button playButton22 = (Button) findViewById(R.id.button6);
        Button playButton23 = (Button) findViewById(R.id.button5);
        Button playButton24 = (Button) findViewById(R.id.button4);
        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE1();
            }
        });
        playButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE3();
            }
        });
        playButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE3();
            }
        });
        playButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE3();
            }
        });
        playButton24.setOnClickListener(new View.OnClickListener() {
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
