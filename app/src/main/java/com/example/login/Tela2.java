package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }


    public void irParaTela2(View view) {
        Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent2);
    }

    public void voltarTelaPrincipal(View view) {
        Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent2);
    }
    }
