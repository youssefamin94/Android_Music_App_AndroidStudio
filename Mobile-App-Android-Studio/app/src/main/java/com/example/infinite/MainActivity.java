package com.example.infinite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button morningButton = (Button) findViewById(R.id.button);
        Button eveningButton = (Button) findViewById(R.id.button3);
        morningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE2();
            }
        });
        eveningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE21();
            }
        });
    }
    public void INFINITE2() {
        Intent intent = new Intent(this,INFINITE2.class);
        startActivity(intent);
    }
    public void INFINITE21() {
        Intent intent = new Intent(this,INFINITE21.class);
        startActivity(intent);
    }
}