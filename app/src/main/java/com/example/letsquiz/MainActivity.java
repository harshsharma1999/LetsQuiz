package com.example.letsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout username, password;
    private ProgressBar bar;
    private Object TextInputLayout;
    private FirebaseAuth mAuth;
    private TextView register, register1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get reference of all the required views
        username = (TextInputLayout) findViewById(R.id.Email);
        password = (TextInputLayout) findViewById(R.id.pwd);
        bar = (ProgressBar) findViewById(R.id.progressBar);
        register = findViewById(R.id.registerUser);

        /*setting intent on register textview 1 to go to
          register activity */
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTo = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(goTo);

            }
        });

         /*setting intent on register textview 2 to go to
          register activity */
        register1 = findViewById(R.id.registerUser2);
        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTo = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(goTo);

            }
        });


    }

}