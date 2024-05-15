package com.example.infoeduca;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quiz2 extends AppCompatActivity {

    private TextView countLabel2;
    private ImageView questionImage;
    private Button answerBotao1;
    private Button answerBotao2;
    private Button answerBotao3;
    private Button answerBotao4;

    private String rightAnswer1;
    private int rightAnswerCount1 = 0;
    private int quizCount1 = 1;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {

            //{"Image name", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"maca", "Apple", "Banana", "Pineapple", "Grape"},
            {"casa", "home", "Apartment", "Hotel", "Building"},
            {"abacaxi", "Pineapple", "Strawberry", "Watermelon", "Grape"},
            {"bola", "Ball", "Doll", "Key", "Sky"},
            {"caneta", "Pen", "Pencil", "Eraser", "Ink"},
            {"livro", "Book", "Notebook", "Table", "Leaf"},
            {"ovelha", "Sheep", "Alligator", "Horse", "Dog"},
            {"saia", "Skirt", "Hat", "T-shirt", "Pants"},
            {"olho", "Eye", "Eyes", "Mouth", "Hands"},
            {"chuva", "Umbrella", "Water", "Cloud", "Rain"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        countLabel2 = findViewById(R.id.countLabel2);
        questionImage = findViewById(R.id.questionImage);
        answerBotao1 = findViewById(R.id.answerBotao1);
        answerBotao2 = findViewById(R.id.answerBotao2);
        answerBotao3 = findViewById(R.id.answerBotao3);
        answerBotao4 = findViewById(R.id.answerBotao4);


        for(int i = 0; i<quizData.length;i++){
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]);
            tmpArray.add(quizData[i][1]);
            tmpArray.add(quizData[i][2]);
            tmpArray.add(quizData[i][3]);
            tmpArray.add(quizData[i][4]);

            quizArray.add(tmpArray);
        }
    showNextQuiz();
    }
    public void showNextQuiz(){
        countLabel2.setText("Q" + quizCount1);
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        ArrayList<String> quiz = quizArray.get(randomNum);

        questionImage.setImageResource(getResources().getIdentifier(quiz.get(0), "drawable", getPackageName()));
    rightAnswer1 = quiz.get(1);


    quiz.remove(0);
        Collections.shuffle(quiz);

        answerBotao1.setText(quiz.get(0));
        answerBotao2.setText(quiz.get(1));
        answerBotao3.setText(quiz.get(2));
        answerBotao4.setText(quiz.get(3));

        quizArray.remove(randomNum);
    }
    public void checkAnswer1(View view){
    Button answerBotao = findViewById(view.getId());
    String btnText = answerBotao.getText().toString();

    String alertTitle;

    if(btnText.equals(rightAnswer1)){
        alertTitle = "Correct!";
    rightAnswerCount1++;

    }else {
    alertTitle = "Wrong...";
    }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alertTitle);
        builder.setMessage("Answer : " + rightAnswer1);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(quizArray.size() < 1){

                    showResult();
                } else{
                    quizCount1++;
                    showNextQuiz();
                }
            }
        });
        builder.setCancelable(false);
        builder.show();
    }
    public void  showResult(){
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("Result");
    builder.setMessage(rightAnswerCount1 + " / 10");
    builder.setPositiveButton("Try again", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            recreate();
        }
    });
        builder.setNegativeButton("Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);

            }
        });
        builder.show();
    }
}
