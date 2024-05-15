package com.example.infoeduca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);
    }

    public void irParaPrincipal3(View view){
        Intent intent1 = new Intent(getApplicationContext(), Principal3.class);
        startActivity(intent1);
    }
    public void irParaPuzzle(View view){
        Intent intent1 = new Intent(getApplicationContext(), Puzzle.class);
        startActivity(intent1);
    }
}
