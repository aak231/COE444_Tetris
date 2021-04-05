package com.example.coe444_tetris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText username;
    private EditText password;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.usernameID);
        password = (EditText) findViewById(R.id.passwordID);
        loginButton = (Button) findViewById(R.id.loginButtonID);


        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.loginButtonID:
                Intent game = new Intent(this, GameActivity.class);
                startActivity(game);
        }
    }
}