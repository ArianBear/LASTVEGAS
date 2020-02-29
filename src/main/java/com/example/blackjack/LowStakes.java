package com.example.blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LowStakes extends AppCompatActivity {
    private Button btnHit;
    private Button btnBet;
    private Button btnShowCards;
    private Button btnShowMoney;
    private Button btnShowOpCards;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_stakes);
    }

    public void onHit(View view){
        btnHit = findViewById(R.id.Hit);

    }
}
