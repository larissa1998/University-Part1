package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial4);
    }

    public void irParaTutorial5(View view){
        Intent intent1 = new Intent(getApplicationContext(), Tutorial5.class);
        startActivity(intent1);
    }
}
