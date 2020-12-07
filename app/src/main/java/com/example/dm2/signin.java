package com.example.dm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void onClickSignIn (View v){
        Intent intent2 = new Intent(signin.this, signup.class);
        startActivity(intent2);
    }
}