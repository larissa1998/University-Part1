package com.example.infoeduca;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Quizz extends AppCompatActivity {

    private TextView countLabel;
    private  TextView questionLabel;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;
    private Button answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static  final private int QUIZ_COUNT = 15;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
        //{"Obj", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"Qual o plural de batata?", "Potatoes","Tomatos", "Apples", "Potatos"},
            {"Responda o How old are you?", "I am Twenty years old","Yes, I am eighteen", "My name is Peter", "I have sixteen years old"},
            {"Como se diz 33 em inglês?", "Thirty-three","Twelve three", "Twenty three", "Forty three"},
            {"Como se diz borracha em inglês?", "Eraser","Ruler", "Knife", "Borracha"},
            {"Como se diz Bom dia?", "Good Morning","Morning", "Night", "Afternoon"},
            {"Como se diz bola?", "Ball","Doll", "Tree", "Stars"},
            {"Como se diz azul?", "Blue","White", "Green", "Red"},
            {"Como se diz janela?", "Window","Flowers", "Sky", "Poor"},
            {"Como se diz mãe?", "Mother","Father", "Sister", "Brother"},
            {"Qual o significado de Rain?", "Chuva","Sol", "Nublado", "Chuvisco"},
            {"Qual o significado de Dark?", "Escuro","Claro", "Luz", "Lampada"},
            {"Qual o significado de table?", "Mesa","Computador", "Madeira", "Piso"},
            {"Qual o significado de romance?", "Romance","Apaixonado", "Roma", "Amor"},
            {"Diga o plural de notebook?", "Notebooks","Tablet", "Smartphone", "Mouse"},
            {"Como se diz mão?", "Hand","Eyes", "Head", "Heart"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        countLabel = (TextView)findViewById(R.id.countLabel);
        questionLabel = (TextView)findViewById(R.id.questionLabel);
        answerBtn1 = (Button)findViewById(R.id.answerBtn1);
        answerBtn2 = (Button)findViewById(R.id.answerBtn2);
        answerBtn3 = (Button)findViewById(R.id.answerBtn3);
        answerBtn4 = (Button)findViewById(R.id.answerBtn4);

        //create quizArray from quizData
        for (int i = 0; i < quizData.length; i++){

            //Prepare array
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); //Obj
            tmpArray.add(quizData[i][1]); //Right Answer
            tmpArray.add(quizData[i][2]); //Choice1
            tmpArray.add(quizData[i][3]); //Choice2
            tmpArray.add(quizData[i][4]); //Choice3

            //Add tmpArray to quizArray
            quizArray.add(tmpArray);

        }
        showProxQuiz();
    }

    public  void showProxQuiz(){

    //Update quizCountLabel
        countLabel.setText("Q" + quizCount);

        //Generate random number between 0 and 14
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        //Pick one quiz set
        ArrayList<String> quiz = quizArray.get(randomNum);

        //Set question and right answer
        //Array format
        questionLabel.setText(quiz.get(0));
        rightAnswer = quiz.get(1);

        //Remove Obj from quiz and shuffle choice
        quiz.remove(0);
        Collections.shuffle(quiz);

        //Set Choices
        answerBtn1.setText(quiz.get(0));
        answerBtn2.setText(quiz.get(1));
        answerBtn3.setText(quiz.get(2));
        answerBtn4.setText(quiz.get(3));

    // Remove this quiz from quizArray
        quizArray.remove(randomNum);

    }

    /*public void checkAnswer(View view){
     // Get pushed button
        Button answerBtn = (Button)findViewById(view.getId());
        String btnText = answerBtn.getText().toString();

        String alertTitle;

        if(btnText.equals(rightAnswer)){
            //Correct
            alertTitle = "Correct!";
            rightAnswerCount++;

        }else{
            //Wrong
            alertTitle = "Wrong!";
        }
    //Create Dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alertTitle);
        builder.setMessage("Answer :" + rightAnswer);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(quizCount == QUIZ_COUNT){
                    //Show Result
                    Intent intent = new Intent(getApplicationContext(), ResultQuizz.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);
                } else{
                    quizCount++;
                    showProxQuiz();
                }
            }
        });
        builder.setCancelable(false);
        builder.show();




    }*/

    public void checkAnswer(View view){
        Button answerBotao = findViewById(view.getId());
        String btnText = answerBotao.getText().toString();

        String alertTitle;

        if(btnText.equals(rightAnswer)){
            alertTitle = "Correct!";
            rightAnswerCount++;

        }else {
            alertTitle = "Wrong...";
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alertTitle);
        builder.setMessage("Answer : " + rightAnswer);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(quizArray.size() < 1){

                    showResult();
                } else{
                    quizCount++;
                    showProxQuiz();
                }
            }
        });
        builder.setCancelable(false);
        builder.show();
    }
    public void  showResult(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        builder.setMessage(rightAnswerCount + " / 15");
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
