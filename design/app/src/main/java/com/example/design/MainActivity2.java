package com.example.design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    ImageButton b;
    ImageButton c;
    ImageButton d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = findViewById(R.id.sr);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i);
            }
        });

        c = findViewById(R.id.st);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new
                        Intent(getApplicationContext(), MainActivity4.class);
                startActivity(j);

            }
        });
        d = findViewById(R.id.pr);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new
                        Intent(getApplicationContext(), MainActivity.class);
                startActivity(k);

            }
        });
    }
}
