package com.example.android.scorecounter1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        int scoreA = 0;
        int scoreB = 0;

        public void But11(View view){
            scoreA = scoreA + 1;
            displayForA(scoreA);
        }
        public void But12(View view){
            scoreA = scoreA + 2;
            displayForA(scoreA);
        }
        public void But13(View view){
            scoreA = scoreA + 3;
            displayForA(scoreA);
        }
        public void But14(View view){
            scoreA = scoreA + 4;
            displayForA(scoreA);
        }
        public void But16(View view){
            scoreA = scoreA + 6;
            displayForA(scoreA);
        }
        public void But21(View view){
            scoreB = scoreB + 1;
            displayForB(scoreB);
        }
        public void But22(View view){
            scoreB = scoreB + 2;
            displayForB(scoreB);
        }
        public void But23(View view){
            scoreB = scoreB + 3;
            displayForB(scoreB);
        }
        public void But24(View view){
            scoreB = scoreB + 4;
            displayForB(scoreB);
        }
        public void But26(View view){
            scoreB = scoreB + 6;
            displayForB(scoreB);
        }
        public void Reset(View view){
            scoreA = 0;
            scoreB = 0;
            displayForB(scoreB);
            displayForA(scoreA);
        }

        @SuppressLint("SetTextI18n")
        private void displayForA(int score1){
            TextView scoreView1 = (TextView) findViewById(R.id.txt12);
            scoreView1.setText(""+score1);
        }
        @SuppressLint("SetTextI18n")
        private void displayForB(int score2){
            TextView scoreView2 = (TextView) findViewById(R.id.txt22);
            scoreView2.setText(""+score2);
        }
}
