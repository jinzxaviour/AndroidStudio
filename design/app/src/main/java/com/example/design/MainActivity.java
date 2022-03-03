package com.example.design;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usrname;
    EditText pswd;
    Button loginbut;
    String name="Jins";
    String ps="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrname=findViewById(R.id.UserName);
        pswd=findViewById(R.id.Password);
        loginbut=findViewById(R.id.button);

        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName=usrname.getText().toString();
                String inppass=pswd.getText().toString();
                Intent i= new
                        Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);


            }
        });



    }
}