package com.example.infoeduca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal3);
    }

    public void irParaQuizz(View view){
        Intent intent1 = new Intent(getApplicationContext(), Quizz.class);
        startActivity(intent1);
    }

    public void irParaQuizz2(View view){
        Intent intent1 = new Intent(getApplicationContext(), Quiz2.class);
        startActivity(intent1);
    }
}
