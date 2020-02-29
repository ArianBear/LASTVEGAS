package com.example.blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInMenu extends AppCompatActivity {
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_menu);
    }

    public void onSubmit(View view) {
        btnSubmit = findViewById(R.id.btnSubmit);
        Intent intent = new Intent(LogInMenu.this, BJMenu.class);
        startActivity(intent);

    }
}
