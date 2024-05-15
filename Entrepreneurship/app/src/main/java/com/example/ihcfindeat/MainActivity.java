package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void irParaCadastro(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaCadastrar.class);
        startActivity(intent1);
    }


    public void irParaFace(View view){
        Intent intent1 = new Intent(getApplicationContext(), RedirecionarFB.class);
        startActivity(intent1);
    }

    public void irParaGoogle(View view){
        Intent intent1 = new Intent(getApplicationContext(), RedirecionarGoogle.class);
        startActivity(intent1);
    }


    public void irParaPrincipal(View view){
        Intent intent1 = new Intent(getApplicationContext(), Principal.class);
        startActivity(intent1);
    }

}
