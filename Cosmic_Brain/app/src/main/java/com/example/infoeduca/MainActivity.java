package com.example.infoeduca;

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
    public void irParaPrincipal2(View view){
        Intent intent1 = new Intent(getApplicationContext(), Principal2.class);
        startActivity(intent1);
    }

    public void irParaAbout(View view){
        Intent intent1 = new Intent(getApplicationContext(), About.class);
        startActivity(intent1);
    }
}
