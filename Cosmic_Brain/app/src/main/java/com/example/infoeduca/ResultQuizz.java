package com.example.infoeduca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultQuizz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quizz);

        TextView resultLabel = (TextView)findViewById(R.id.resultLabel);
        TextView totalScoreLabel = (TextView)findViewById(R.id.totalScoreLabel);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);

        SharedPreferences settings = getSharedPreferences("quizApp", Context.MODE_PRIVATE);
        int totalScore = settings.getInt("totalScore", 0);

        totalScore += score;

        resultLabel.setText(score + " / 15");
        totalScoreLabel.setText("Total Score : " + totalScore);

        //Update total score
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("totalScore", totalScore);
        editor.commit();
    }


    public void returnTop(View view){
        Intent intent1 = new Intent(getApplicationContext(), Quizz.class);
        startActivity(intent1);
    }

}
