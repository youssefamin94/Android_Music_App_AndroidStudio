package com.example.infinite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class INFINITE3 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinite3);
        Button backButton3 = (Button) findViewById(R.id.button11);
        backButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INFINITE2();
            }
        });
}
    public void INFINITE2(){
        Intent intent = new Intent(this, INFINITE2.class);
        startActivity(intent);
    }
}