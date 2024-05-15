package com.example.ihcfindeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial5);
    }


    public void irParaTutorial6(View view){
        Intent intent1 = new Intent(getApplicationContext(), Tutorial6.class);
        startActivity(intent1);
    }
}
