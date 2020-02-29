package com.example.blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpMenu extends AppCompatActivity {
    private Button btnSignUpSubmit;
    private EditText password;
    private EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_menu);
    }

    public void OnSignUpSubmit(View view) {
        btnSignUpSubmit = findViewById(R.id.btnSubmit);
        Intent intent = new Intent(SignUpMenu.this, LogInMenu.class);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirm);
        String a = password.getText().toString();
        String b = confirmPassword.getText().toString();
        if (a.equalsIgnoreCase(b)) {
            startActivity(intent);
        } else
            Toast.makeText(getApplicationContext(), "Passwords Do Not Match", Toast.LENGTH_LONG).show();
    }


}
