package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3);
    }

    public void irParaTutorial4(View view){
        Intent intent1 = new Intent(getApplicationContext(), Tutorial4.class);
        startActivity(intent1);
    }
}
