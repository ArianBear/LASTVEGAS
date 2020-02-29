package com.example.blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnEnter;
    private Button btnLogIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {

        btnEnter = findViewById(R.id.button1);
        Intent intent = new Intent(MainActivity.this, BJMenu.class);
        startActivity(intent);
    }

    public void onSignUp(View view) {
        btnSignUp = findViewById(R.id.signUp);
        Intent intent = new Intent(MainActivity.this, SignUpMenu.class);
        startActivity(intent);
    }

    public void onLogIn(View view) {
        btnLogIn = findViewById(R.id.logIn);
        Intent intent = new Intent(MainActivity.this, LogInMenu.class);
        startActivity(intent);
    }

}
