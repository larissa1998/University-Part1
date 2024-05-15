package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial6);
    }

    public void irParaPrincipal(View view){
        Intent intent1 = new Intent(getApplicationContext(), Principal.class);
        startActivity(intent1);
    }
}
