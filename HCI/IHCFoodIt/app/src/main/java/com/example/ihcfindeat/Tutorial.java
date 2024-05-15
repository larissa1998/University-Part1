package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }

    public void irParaPrincipal(View view){
        Intent intent1 = new Intent(getApplicationContext(), Principal.class);
        startActivity(intent1);
    }

    public void irParaPrincipal2(View view){
        Intent intent1 = new Intent(getApplicationContext(), Tutorial2.class);
        startActivity(intent1);
    }
}
